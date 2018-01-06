/**
 * Created by vrasa on 12/26/2016.
 */

import java.util.*;
import java.io.*;

public class Translator 
{
    public static Translator mips;
    private int labelNum;
    private int receiverNum;
    private Hashtable<String,Integer> actorsMemoryAddresses;
    private Hashtable<String,Hashtable<String,Integer>> receiverNumbers;
    private Hashtable<Integer, String> receiverNames;
    private File output;
    private ArrayList <String> instructions;
    private ArrayList <String> initInstructions;
    private int t1offset;
    private int initedActorsCount;
    private int stackstart;
    private int heapstart;
    private int actorSegmentStart;
    private int dataSegmentStart;
    private int argumentStart;
    private int rvalueStackStart;
    public Translator(){
	    labelNum=0;
        initedActorsCount = 0;
        receiverNum=0;
        stackstart = 0x7ffff7f8;
        heapstart  = 0x10011111;
        actorSegmentStart= 0x11011111;
        dataSegmentStart= 0x00001000;
        argumentStart = 0x10002000;
        rvalueStackStart = 0x7ffffffc;
	    actorsMemoryAddresses=new Hashtable<>();
	    receiverNumbers=new Hashtable<>();// String:actor name
        instructions = new ArrayList<String>();
        initInstructions = new ArrayList<String>();
        receiverNames = new Hashtable<>();
	    t1offset=0;

        output = new File("out.asm");
        try {
            output.createNewFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    ---actor data segment based on $t1-----------------
    ------------------------------
    |      zarfiate fe'eli       |
    ------------------------------
    |        read pointer        |
    ------------------------------
    |       write pointer        |
    ------------------------------
    | offst addr of sender actor | }
    ------------------------------ }
    |abs addr first ($t2based)arg| }
    ------------------------------ }  for every message slot
    |     count of arguments     | }
    ------------------------------ }
    |     number of receiver     | }
    */

     public void addActor(String name,int mailboxSize){
        
        initInstructions.add("# adding an actor");
        if(SymbolTable.top.actorHasInit()){
            initInstructions.add("li $a0, " + (mailboxSize-1));//because of init msg
            initedActorsCount++;
        }
        else
            initInstructions.add("li $a0, " + mailboxSize);     
            initInstructions.add("sw $a0, " + actorsMemoryAddresses.get(name) + "($t1)");
            initInstructions.add("move $t3,$t1");
            initInstructions.add("addi $t3,$t3, "+(actorsMemoryAddresses.get(name)+12));
            initInstructions.add("sw $t3, "+(actorsMemoryAddresses.get(name)+4)+"($t1)");//read pointer tanzim mishavad
            if( !SymbolTable.top.actorHasInit() || mailboxSize==1){
                initInstructions.add("move $t3,$t1");
                initInstructions.add("addi $t3,$t3, "+(actorsMemoryAddresses.get(name)+12));
                initInstructions.add("sw $t3, "+(actorsMemoryAddresses.get(name)+8)+"($t1)");//write pointer tanzim mishavad
        }else{
                initInstructions.add("move $t3,$t1");
                initInstructions.add("addi $t3,$t3, "+(actorsMemoryAddresses.get(name)+28));
                initInstructions.add("sw $t3, "+(actorsMemoryAddresses.get(name)+8)+"($t1)");//write pointer tanzim mishavad
        }
        initInstructions.add("#actor added");
    }
    public void addNewActor(String name,int mailboxsize){
        actorsMemoryAddresses.put(name,t1offset);
        receiverNumbers.put(name,new Hashtable<>());
        t1offset+=12;
        t1offset+=mailboxsize*16;
    }
    public void addNewReceiver(String aname,String rkey,String rname){
            receiverNumbers.get(aname).put(rkey,receiverNum);
            receiverNames.put(receiverNum,rname);
            receiverNum++;
    }
    public void addReceiver(String aname,String rkey,boolean isInit){

        if(isInit){//putting init message
            initInstructions.add("#putting init message in actor "+aname+"mailbox");
            initInstructions.add("li $t3, "+actorsMemoryAddresses.get(aname));
            initInstructions.add("add $t3 ,$t3,$t1");
            initInstructions.add("sw $zero , 20($t3)");
            initInstructions.add("li $t5, "+receiverNumbers.get(aname).get(rkey));
            initInstructions.add("sw $t5 , 24($t3)");
            initInstructions.add("#init message put");
        }

    }
	public void generateReceiverStub(String name,String key)
    {
        String actorName=((ActorSymbolTableItem)SymbolTable.top.pre.pre.getInCurrentScope(SymbolTable.top.pre.getkeyOfActorAccordingToActorST())).getName();
        instructions.add(name+receiverNumbers.get(actorName).get(key)+":");
    }
    public void addReceiverSkeleton(){
        instructions.add("jr $ra");
        instructions.add("#receiver added");
    }
    public void makeOutput(){
        //this.addSystemCall(10);
        try {
            PrintWriter writer = new PrintWriter(output);
            writer.println( ".data" );
            writer.println("invalidmsgmsg : "+".asciiz \"InvalidMessageError\"");
            writer.println("actorMBfullmsg : "+".asciiz \"ActorBufferOverflowError\"");
            writer.println( "indexOutOfRange : " + " .asciiz \"indexOutOfRangeException\"" );
            writer.println( ".text" );
            writer.println("main:");
            writer.println( "li $sp, " + stackstart );
            writer.println( "li $t6, " + rvalueStackStart);
    	    writer.println( "li $t1, " + actorSegmentStart );
    	    writer.println( "li $t2, " + heapstart );
    	    writer.println( "li $t9, " + argumentStart );
    	    writer.println( "li $gp, " + dataSegmentStart ); 
            writer.println( "li $t8 , " + initedActorsCount);
            writer.println("move $fp, $sp");
            for (int i=0;i<initInstructions.size();i++){
                writer.println(initInstructions.get(i));
            }
            writer.println( "j superwhile" );
		    makeSuperWhile();
		    messagePicker();
            for (int i=0;i<instructions.size();i++){
                writer.println(instructions.get(i));
            }
            writer.println("programcomplete:");
            writer.println( "li $v0, 10" );
            writer.println( "syscall" );
            writer.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
    public void copyArgToHeap(SymbolTableTemporaryVariableItem arg , int argNumber , int argsCount )
    {
        instructions.add("#copying an argument");
        instructions.add( "addiu $t5, $fp, " + ( -( argNumber - 1 - argsCount ) * Type.WORD_BYTES ) );
        instructions.add("li $t3, 0");
        instructions.add("li $t4, " + arg.getVariable().getType().size() / Type.WORD_BYTES );
        instructions.add("copyloop" + labelNum + " :");
        instructions.add("beq $t4,$t3 , copyfinished"+(labelNum+1));
        instructions.add("lw $t7, 0($t5)");//value to copy
        instructions.add("sw $t7, 0($t2)");//value has just been copied
        instructions.add("addi $t2,$t2,4");//incrementing heap pointer by 4
        if(arg.isLValue==1)//going to next address to be copied
            instructions.add("addiu $t5,$t5,-4");
        else
            instructions.add("addi $t5,$t5,4");
        instructions.add("addi $t3,$t3,1");
        instructions.add("j copyloop"+labelNum);
        labelNum++;
        instructions.add("copyfinished"+labelNum+" :");
        instructions.add("#copying end");
        labelNum++;
        instructions.add("# pop stack");
        instructions.add("addiu $fp, $fp, -4");
        instructions.add("# end of pop stack");
    }
    public void addReceiverCall(String callerActorName,String calleeActorName,String receiverkey,ArrayList<SymbolTableTemporaryVariableItem> arguments){
        instructions.add("#sending a message");
        instructions.add("lw $t3, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");
        instructions.add("bne $t3, $zero , "+calleeActorName+"notfullmailboxbranchlabel"+labelNum);
        instructions.add("la $a0 , actorMBfullmsg");
        addSystemCall(4);
        instructions.add("j endcall"+(labelNum+1));
        instructions.add(calleeActorName+"notfullmailboxbranchlabel"+labelNum+" :");
        labelNum++;
        //call code
        instructions.add("lw $t3, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");//zarfiate fe'eli load mishavad
        instructions.add("addiu $t3 ,$t/3, -1");
        instructions.add("sw $t3, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");//zarfiat yeki kam mishavad
        instructions.add("addi $t8,$t8,1");//te'edade kolle payamha yeki ziad mishavad
        instructions.add("lw $t5, "+(actorsMemoryAddresses.get(calleeActorName)+8)+"($t1)");//$t5 <- write pointer
        instructions.add("li $t3, "+actorsMemoryAddresses.get(callerActorName));
        instructions.add("sw $t3, 0($t5)");//putting sender address(offset from $t1) to slot
        instructions.add("sw $t2, 4($t5)");//putting addr of first argument( it is heap pointer)
        instructions.add("li $t3, "+arguments.size());
        instructions.add("sw $t3, 8($t5)");//putting count of arguments
        instructions.add("li $t3, "+receiverNumbers.get(calleeActorName).get(receiverkey));
        instructions.add("sw $t3, 12($t5)");//putting number of receiver
        //fulfilling the heap and incrementing the heap pointer 
        for(int i = 0 ; i < arguments.size() ; i++ ){
            copyArgToHeap( arguments.get( i ) , i + 1 , arguments.size() );
        }
        //end
        //modifying  write pointer
        instructions.add("lw $t5, "+(actorsMemoryAddresses.get(calleeActorName)+8)+"($t1)");//$t5 <- write pointer
        instructions.add("addi $t5,$t5,16");
        instructions.add("li $t3,16");
        SymbolTable actorST=SymbolTable.top;
        while(actorST.pre.pre!=null)
            actorST=actorST.pre;
        instructions.add("li $t7, "+((ActorSymbolTableItem)actorST.pre.get("actor_"+calleeActorName)).getActorMailBoxSize());//$t7<- zarfiate kolle mailboxe callee
        instructions.add("multu $t3,$t7");
        instructions.add("mflo $t3");
        instructions.add("li $t7 ,"+actorsMemoryAddresses.get(calleeActorName));
        instructions.add("add $t7,$t7,$t1");//$t7<- absolute addr of callee actor memory
        instructions.add("add $t3,$t3,$t7");
        instructions.add("addi $t3,$t3,12");
        //instructions.add("remu $a3,$a3,$t3");
        //instructions.add("beq $a3,$zero, "+"pointermending"+labelNum);
        instructions.add("beq $t5,$t3, pointermending"+(labelNum+1));
        instructions.add("sw $t5, "+(actorsMemoryAddresses.get(calleeActorName)+8)+"($t1)");//write pointer miravad roo slote baadi
        instructions.add("j pointermended"+(labelNum+2));
        instructions.add("pointermending"+(labelNum+1)+" :");
        instructions.add("li $t5, "+(actorsMemoryAddresses.get(calleeActorName)+12));
        instructions.add("add $t5,$t5,$t1");
        instructions.add("sw $t5, "+(actorsMemoryAddresses.get(calleeActorName)+8)+"($t1)");//write pointer miravad roo slote baadi (ya een ejra mishavad ya balaii)
        instructions.add("pointermended"+(labelNum+2)+" :");
        instructions.add("endcall"+labelNum+" :");
        labelNum+=3;
    }
    public void messagePicker(){//$a0 <- absolute address of the actor data segment , $a1 <- actor mailbox size
        instructions.add("#start of messagepicker");
        instructions.add("messagepicker:");
        instructions.add("lw $t3, 0($a0)");
        instructions.add("bne $a1,$t3, hasmessage"+labelNum);
        instructions.add("jr $ra");
        instructions.add("hasmessage"+labelNum+" :");
        labelNum++;
        instructions.add("lw $a2, 0($a0)");//
        instructions.add("addi $a2,$a2,1");//zarfiate queue yeki ziad mishe
        instructions.add("sw $a2, 0($a0)");//
        instructions.add("addiu $t8,$t8,-1");//te'edade kolle payam ha yeki kam mishe
        instructions.add("lw $a2, 4($a0)");//$a2<-absolute addresse oon sloti ke payami ke bayad bekhonim tooshe
        instructions.add("lw $a3, 4($a0)"); 
        instructions.add("addi $a3,$a3,16");
        instructions.add("li $t3,16");
        instructions.add("multu $t3,$a1");
        instructions.add("mflo $t3");
        instructions.add("add $t3,$t3,$a0");
        instructions.add("addi $t3,$t3,12");
        //instructions.add("remu $a3,$a3,$t3");
        //instructions.add("beq $a3,$zero, "+"pointermending"+labelNum);
        instructions.add("beq $a3,$t3, pointermending"+labelNum);
        instructions.add("sw $a3,4($a0)");//read pointer miravad roo slote baadi
        instructions.add("j pointermended"+(labelNum+1));
        instructions.add("pointermending"+labelNum+" :");
        labelNum++;
        instructions.add("addi $a3,$a0,12");
        instructions.add("sw $a3,4($a0)");//read pointer miravad roo slote baadi (ya een ejra mishavad ya balaii)
        instructions.add("pointermended"+labelNum+" :");
        labelNum++;
        instructions.add("addi $t3,$a2,12");
        instructions.add("lw $t3, 0($t3)");//$t3 <- shomare receiveri ke bayad be kode an beparim.
        String aName,rkey;
        Enumeration aNames= actorsMemoryAddresses.keys();
        Enumeration rkeys;
        while(aNames.hasMoreElements()){
            aName=(String) aNames.nextElement();
            instructions.add("li $t5, "+actorsMemoryAddresses.get(aName));
            instructions.add("add $t5,$t5,$t1");
            instructions.add("bne $t5,$a0, not"+labelNum+aName);
            rkeys=receiverNumbers.get(aName).keys();
            while(rkeys.hasMoreElements()){
                rkey=(String) rkeys.nextElement();
                instructions.add("li $t7, "+receiverNumbers.get(aName).get(rkey));
                instructions.add("beq $t7,$t3 , "+receiverNames.get(receiverNumbers.get(aName).get(rkey))+receiverNumbers.get(aName).get(rkey));
            }
            //agar hameye beq ha ra rad konad che?
            instructions.add("not"+labelNum+aName+":");
            labelNum++;
        }
        instructions.add("#end of messagepicker");
        //  vaziiate ajib .adade receiver male hichkodam az actor ha naboode che konim? 
    }
    public void makeSuperWhile(){
        instructions.add("#start of superwhile");
        instructions.add("superwhile :");
        instructions.add("beq $t8,$zero, programcomplete");
        Enumeration actornames = actorsMemoryAddresses.keys();
        String str;
        while(actornames.hasMoreElements()) {
            str = (String) actornames.nextElement();
            instructions.add("li $a1, "+((ActorSymbolTableItem)SymbolTable.top.get("actor_"+str)).getActorMailBoxSize());
            instructions.add("li $a0, "+actorsMemoryAddresses.get(str));
            instructions.add("add $a0,$a0,$t1");
            instructions.add("jal messagepicker");
        }
        instructions.add("j superwhile");
        instructions.add("#end of superwhile");
        labelNum++;
    }
    public void generateQuit(){
        instructions.add("jr $ra");
    }
    public int generate_if_stub(SymbolTableTemporaryVariableItem item){
        instructions.add("lw $t5, -4($fp)");
        instructions.add("lw $t5, 0($t5)");
        instructions.add("beq $t5,$zero ,falseif"+labelNum);
        labelNum++;
        return labelNum-1;
    }
    public int generate_if_skeleton(int falseifLabelNum){
        instructions.add("j endif"+labelNum);
        labelNum++;
        instructions.add("falseif"+falseifLabelNum+" :");
        return labelNum-1;
    }
    public int generate_elif_stub(SymbolTableTemporaryVariableItem item){
        instructions.add("lw $t5, -4($fp)");
        instructions.add("lw $t5, 0($t5)");
        instructions.add("beq $t5 ,$zero, falseelif"+labelNum);
        labelNum++;
        return labelNum-1;
    }
    public void generate_elif_skeleton(int falseelifLabelNum,int endifLabelNum){
        instructions.add("j endif"+endifLabelNum);
        instructions.add("falseelif"+falseelifLabelNum+" :");
    }
    public void generate_endif(int endifLabelNum){
        instructions.add("endif"+endifLabelNum+" :");
    }
    public void generate_foreach_stub(SymbolTableCursorItem cursor,SymbolTableTemporaryVariableItem cursed){
        instructions.add("#start OF foreach");
        instructions.add("lw $t5, -4($fp)");//$t5 <- address of cursed
        instructions.add("addiu $fp , $sp, "+cursor.elementOffset+cursor.getVariable().getType().size()); 
        int step=((ArrayType)cursed.getVariable().getType()).getDimensionByteCount(1);
        instructions.add("li $t3, 0");//$t3 <- current index of array
        instructions.add("li $t4, "+((ArrayType)cursed.getVariable().getType()).getDimensionSize(0));
        instructions.add("foreachloop"+labelNum+":");
        instructions.add("beq $t3,$t4, foreachend"+(labelNum+1));
        cursor.foreachloopLabelNum=labelNum;
        cursor.foreachendLabelNum=labelNum+1;
        labelNum+=2;
    }
    public void generate_foreach_skeleton(SymbolTableCursorItem cursor,SymbolTableVariableItemBase cursed){
            instructions.add("lw $t3, "+cursor.elementOffset+"($sp)");
            instructions.add("addi $t3,$t3 ,1");
            int step=((ArrayType)cursed.getVariable().getType()).getDimensionByteCount(1);
            instructions.add("sw $t3, "+cursor.elementOffset+"($sp)");
            instructions.add("lw $t5, "+cursed.getOffset()+"($sp)");
            instructions.add("addi $t5,$t5 , "+step);
            instructions.add("sw $t5 "+cursed.getOffset()+"($sp)");
            instructions.add("li $t4, "+((ArrayType)cursed.getVariable().getType()).getDimensionSize(0));
            instructions.add("j foreachloop"+cursor.foreachloopLabelNum);
            instructions.add("foreachend"+cursor.foreachendLabelNum+":");
            popStack();//pop cursor index
            if(cursor.getVariable().getType() instanceof IntType || cursor.getVariable().getType() instanceof CharType )
            popStack();
            else
            instructions.add("addiu $fp, $fp, -"+((int)(((ArrayType)cursor.getVariable().getType()).getDimensionByteCount(((ArrayType)cursor.getVariable().getType()).DimensionsCount())/4)));
    }
    public void generateCodeForAssignment( int size , int isRightHandLvalue )
    {
        instructions.add( "#doing assignment");
        instructions.add( "li $a0, " + ( size / Type.WORD_BYTES ) );
        instructions.add( "lw $a2, -4($fp)");
        popStack();
        instructions.add( "lw $a3, -4($fp)");
        popStack();
        instructions.add( "move $s0, $a3");
        instructions.add( "li $a1, 0" );
        instructions.add( "LOOP" + labelNum + ": beq $a1, $a0, CONTINUE" + ( labelNum + 1 ) );
        instructions.add( "lw $s6, 0($a2) #loading value of right hand side of assignment" );
        instructions.add( "sw $s6, 0($a3) #storing value of right hand side ");
        if( isRightHandLvalue == 0 )
            instructions.add( "addiu $a2, $a2, 4" );
        else if( isRightHandLvalue == 1 )
            instructions.add( "addiu $a2, $a2, -4" );
        instructions.add( "addiu $a3, $a3, -4" );
        instructions.add( "addiu $a1, $a1, 1" );
        instructions.add( "j LOOP" + labelNum++ );
        instructions.add( "CONTINUE" + labelNum + ": nop");
        instructions.add( "sw $s0, 0($fp)" );
        instructions.add( "addiu $fp, $fp, 4");
        instructions.add( "#end of assignment" );
    }
    public void addLvalueAddressToStack( String name , Register base , int adr )
    {
        instructions.add("# start of adding variable " + name + " to stack");
        instructions.add("addiu $a0, " + base.toString() + ", " + adr );
        instructions.add("sw $a0, 0($fp)");
        instructions.add("addiu $fp, $fp, 4");
        instructions.add("# end of adding variable " + name + " to stack\n");
    }

    public void addConstIntToStack( int number )
    {
        instructions.add( "#adding const integer " + number + " to stack");
        instructions.add( "#and adding its pointer to stack");
        instructions.add( "li $a0, " + number );
        instructions.add( "sw $a0, 0($t6)");
        instructions.add( "sw $t6, 0($fp)" );
        instructions.add( "addiu $t6, $t6, -4");
        instructions.add( "addiu $fp, $fp, 4" );
        instructions.add( "#end of adding a const integer to stack" );
    }    
    public void addConstStringToStack( int len , String cString )
    {
    	instructions.add( "#adding const string " + cString + " to stack" );
    	if( cString.length() == 2 )
            cString = "";
        else
            cString = cString.substring( 1 , len + 1 );
        for( int i = len - 1 ; i >= 0 ; i-- )
    	{
    		char temp = cString.charAt( i );
    		instructions.add( "li $a0, " + ( int ) temp );
    		instructions.add( "sw $a0, 0($t6)" );
    		instructions.add( "addiu $t6, $t6, -4" );
    	}
    	instructions.add( "addiu $a0, $t6, 4" );
    	instructions.add( "sw $a0, 0($fp)");
    	instructions.add( "addiu $fp, $fp, 4");
    }    
    public void IndexOutOfRangeDetector()
    {
        instructions.add( "#indexOutOfRangeDetection" );
        instructions.add( "blt $r0, $a0, CONTINUE" + ( labelNum + 1 ) );
        //instructions.add( "");
    }
    public void generateAccessCode( int size , SymbolTableTemporaryVariableItem array )
    {
        instructions.add( "#Accessing an element" );
        instructions.add("#of array " + array.getVariable().getName() );
        instructions.add( "li $a1 , 0" );
        for( int i = 0 ; i < size ; i++ )
        {
            instructions.add( "lw $a0, " + -4 * ( size - i ) + "($fp)");
            instructions.add( "lw $a0, 0($a0)" );
            int dimByteCount = ( (ArrayType) array.getVariable().getType() ).getDimensionByteCount( i + 1 );
            instructions.add( "li $a2, " + dimByteCount );
            instructions.add( "multu $a0, $a2");
            instructions.add( "mflo $a0" );
            instructions.add( "addu $a1, $a1, $a0");
        }
        instructions.add( "li $a0, " + size );
        instructions.add( "li $a2, 0" );
        instructions.add( "LOOP" + labelNum + ": beq $a2, $a0 CONTINUE" + ( labelNum + 1 ) );
        popStack();
        instructions.add( "addiu $a2, $a2, 1" );
        instructions.add( "j LOOP" + labelNum);
        labelNum++;
        instructions.add( "CONTINUE" + labelNum + ": lw $a0, -4($fp)");
        if( array.isLValue == 1 )
        	instructions.add( "subu $a1 , $a0 , $a1" );
        else
        	instructions.add( "addu $a1, $a0, $a1" );
        instructions.add( "sw $a1, -4($fp)" );
        instructions.add( "#Access End" );
    }

    public void popStack(){
        instructions.add("# pop stack");
        instructions.add("addiu $fp, $fp, -4");
        instructions.add("# end of pop stack");
    }
    public void addCode( String inst )
    {
    	instructions.add( inst );
    }

    public void addSystemCall(int x){
        instructions.add("# start syscall " + x);
        instructions.add("li $v0, " + x);
        instructions.add("syscall");
        instructions.add("# end syscall");
    }
    public void generateCodeForNonEqualityBinaryArithmetic( String s )
    {
        Hashtable<String,String> opHash = new Hashtable<String,String>();
        opHash.put( "+" , "add" );
        opHash.put( "-" , "sub" );
        opHash.put( "*" , "mul" );
        opHash.put( "/" , "div");
        opHash.put( "and" , "and" );
        opHash.put( "or" , "or" );
        instructions.add("lw $a0, -4($fp)");
        instructions.add( "lw $a0, 0($a0)" );
        popStack();
        instructions.add("lw $a1, -4($fp)");
        instructions.add( "lw $a1, 0($a1)" );
        popStack();
        instructions.add( opHash.get( s ) + " $a0, $a1, $a0");
    }

    public void generateCodeForEqualityOrCompare( String operator , SymbolTableTemporaryVariableItem t1 , int isLValue2 )
    {
        int incValue1 = -4 , incValue2 = -4;
        if( t1.isLValue == 0 )
            incValue1 = 4;
        if( isLValue2 == 0 )
            incValue2 = 4;
        instructions.add( "lw $s3, -4($fp)");
        popStack();
        instructions.add( "lw $s2, -4($fp)" );
        instructions.add( "li $a1, 0" );
        instructions.add( "li $a0, " + ( t1.getVariable().size() / Type.WORD_BYTES  ) );
        String continue1 = "CONTINUE" + ( labelNum + 1 );
        String loop = "LOOP" + labelNum;
        labelNum++;
        instructions.add( loop + ": beq $a1, $a0, " + continue1 );
        instructions.add( "lw $s0, 0($s2)");
        instructions.add( "lw $s1, 0($s3)");
        if( operator.equals( "==" ) )
            generateForEquality( operator );
        else if( operator.equals( "<" ) || operator.equals( ">" ) )
            generateForCompare( operator );
        instructions.add( "and $s4, $s4, $s5" );
        instructions.add( "addiu $a1, $a1, 1" );
        instructions.add( "addiu $s2, $s2, " + incValue1 );
        instructions.add( "addiu $s3, $s3, " + incValue2 );
        instructions.add( "j " + loop );
        instructions.add( continue1 + ": nop" );
    }

    public void generateForEquality( String operator )
    {
        instructions.add( "xor $s5, $s0, $s1" );
        instructions.add( "beq $s5, 0, CONTINUE" + ( labelNum + 1 ) );
        instructions.add( "li $s5, 1" );
        instructions.add( "CONTINUE" + ( labelNum + 1 ) + ": nop" );
        labelNum++;
        instructions.add( "xori $s5, $s5, 1" );

    }


    public void generateForCompare( String operator )
    {
        if( operator.equals( "<" ) )
            instructions.add( "slt $s5, $s0, $s1" );
        else if( operator.equals( ">" ) )
            instructions.add( "slt $s5, $s1, $s0" ); 
    }

   	public void generateCodeForRecord( ArrayList<SymbolTableTemporaryVariableItem> list )
   	{
        instructions.add( "#adding a record to stack" );
        for( int i = list.size() - 1 ; i >= 0 ; i-- )
        {
            int size = list.get( i ).getVariable().size() / Type.WORD_BYTES;
            instructions.add( "li $a0, " + size);
            instructions.add( "li $a1, 0" );
            instructions.add( "lw $a3, -4($fp)");
            if( list.get( i ).isLValue == 1 )
                instructions.add( "addiu $a3, $a3, " + ( -( size - 1 ) * Type.WORD_BYTES ));
            else if( list.get( i ).isLValue == 0 )
                instructions.add( "addiu $a3, $a3, " + ( ( size - 1 ) * Type.WORD_BYTES ));
            instructions.add( "LOOP" + labelNum + ": beq $a1, $a0, CONTINUE" + ( labelNum + 1 ) );
            instructions.add( "lw $a2, 0($a3)" );
            instructions.add( "sw $a2, 0($t6)" );
            instructions.add( "addiu $t6, $t6, -4" );
            if( list.get( i ).isLValue == 1 )
                instructions.add( "addiu $a3, $a3, 4" );
            else if( list.get( i ).isLValue == 0 )
                instructions.add( "addiu $a3, $a3, -4" );
            instructions.add( "addiu $a1, $a1, 1" );
            instructions.add( "j LOOP" + labelNum++ );
            instructions.add( "CONTINUE" + labelNum + ": nop" );
            popStack();
        }
        instructions.add( "addiu $a0, $t6, 4" );
        instructions.add( "sw $a0, 0($fp)" );
        instructions.add( "addiu $fp, $fp, 4" );
        instructions.add( "#end of making record" );
   	}

    public void operationCommand(String s) {
        instructions.add("#operation " + s);
        if (s.equals("*") || s.equals("/") || s.equals( "+" ) || s.equals( "-" ) || s.equals( ">") 
        || s.equals( "<" ) || s.equals( "and" ) || s.equals( "or" ) )
            generateCodeForNonEqualityBinaryArithmetic( s );
        else if(s.equals("notu") ){
            instructions.add("lw $a1, -4($fp)");
            instructions.add( "lw $a1, 0($a1)");
            instructions.add("not $a0, $a1" );
            popStack();
        }
        else if( s.equals("-u"))
        {
            instructions.add("lw $a0, -4($fp)");
            instructions.add( "lw $a0, 0($a0)");
            instructions.add( "li $a1, -1");
            instructions.add("mul $a0, $a1, $a0" );
            popStack();   
        }
        instructions.add("sw $a0, 0($t6)");
        instructions.add("sw $t6, 0($fp)" );
        instructions.add("addi $fp, $fp ,4");
        instructions.add( "addi $t6, $t6, -4" );
        instructions.add("# end of operation " + s);
    }

    /*public void write(){
        instructions.add("# writing");
        instructions.add("lw $a0, 4($sp)");
        this.addSystemCall(1);
        popStack();
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing");
    }*/

    /*public void addGlobalToStack(int adr){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global variable to stack");
        instructions.add("lw $a0, " + adr + "($gp)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global variable to stack");
    }

    public void addGlobalVariable(int adr, int x){
//        int adr = table.getAddress(s)*(-1);
        initInstructions.add("# adding a global variable");
        initInstructions.add("li $a0, " + x);
        initInstructions.add("sw $a0, " + adr + "($gp)");
        initInstructions.add("# end of adding a global variable");
    }
    public void variableInitialization( String name , Register base , int adr )
    {
        instructions.add( "#initializing variable " + name );
        instructions.add( "sw $r0, " + adr + "(" + base.getName() + ")" );
    }*/
    /*public void addActor(String name,int mailboxSize){
    	actorsMemoryAddresses.put(name,t1offset);
    	receiversMemoryAddresses.put(name,new Hashtable<>());
        initInstructions.add("# adding an actor");
    	initInstructions.add("li $a0, " + mailboxSize-1);//because of init msg
        initInstructions.add("sw $a0, " + t1offset + "($t1)");
    	//initInstructions.add("actor_"+name+" : "+".asciiz \""+name+" \" ");
    	t1offset+=4;
    	t1offset+=mailboxSize*12;//for putting sender address , address of the first argument(arguments are kept in heap) , count of arguments
        initInstructions.add("# end of adding a global variable");
   }
   public void addReceiver(String name,SymbolTable accordingActorST)
   {
       String actorName=accordingActorST.getInCurrentScope(accordingActorST.getkeyOfActorAccordingToActorST()).getName();
       receiversMemoryAddresses.get(actorName).put(name,t1offset);
   }
   public void addReceiverCall(String callerActorname,String calleeActorName,String receiverName,ArrayList<SymbolTableFunctionArgumentItem> arguments)
   {
    	instructions.add("#calling an actor");		
    	instructions.add("lw $a0, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");
    	instructions.add("bne $a0, $zero , "+calleeActorName+"notfullmailboxbranchlabel");
    	instructions.add("li $v0 , 4");
    	instructions.add("li $a0 , actorMBfullmsg");
    	instructions.add("syscall");
    	instructions.add("j "+calleeActorName+"notfullmailboxbranchlabelback");
    	instructions.add(calleeActorName+"notfullmailboxbranchlabel :");
    	//call code
    	instructions.add("lw $a0, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");//zarfiate fe'eli load mishavad
    	instructions.add("li $a2, 1");
    	instructions.add("sub $a0,$a0,$a2");
    	SymbolTable actorST=SymbolTable.top;
    	while(actorST.getPreSymbolTable()!=null)
    		actorST=actorST.getPreSymbolTable();
    	instructions.add("li $a1 , "+actorST.get("actor_"+calleeActorName).getActorMailBoxSize());
    	instructions.add("sub $a1, $a1, $a0");
    	instructions.add("sw $a0, "+actorsMemoryAddresses.get(calleeActorName)+"($t1)");//zarfiat yeki kam mishavad
    	instructions.add("li $a2, 12");
    	instructions.add("mul $a1,$a2,$a1");
    	instructions.add("li $a0, "+ actorsMemoryAddresses.get(calleeActorName));
    	instructions.add("add $a1,$a1,$a0");
    	instructions.add("li $a0, "+actorsMemoryAddresses.get(callerActorName));
    	instructions.add("add $t5,$a1,$t1");
    	instructions.add("sw $a0, 0($t5)");//putting sender address
    	instructions.add("addi $a1,$a1,4");
    	instructions.add("add $t5,$a1,$t1");
    	instructions.add("sw $t2,0($t5)");//putting address of the first argument
    	instructions.add("addi $a1,$a1,4");	
    	instructions.add("li $a0, "+arguments.size());
    	instructions.add("add $t5,$a1,$t1");
    	instructions.add("sw $a0,0($t5)");//putting count of arguments
    	//fulfilling the heap and incrementing the heap pointer
    	instructions.add(calleeActorName+"notfullmailboxbranchlabelback :");
    }*/
    public void generateRead(int countToRead){
    	instructions.add("#read started");
        instructions.add( "li $a2, 0" );
        instructions.add( "addiu $t6, $t6, " + ( -Type.WORD_BYTES * countToRead ));
        instructions.add( "addiu $a1, $t6, 4" );
        instructions.add( "LOOP" + labelNum + ": beq $a2, " + countToRead + ", CONTINUE" + ( labelNum + 1 ) );
    	instructions.add("li $v0,12");
    	instructions.add("syscall");
        instructions.add( "sw $v0, 0($a1)");
        instructions.add( "addiu $a1, $a1, 4" );
        instructions.add( "addiu $a2, $a2, 1" ); 
        instructions.add( "j LOOP" + labelNum );
        labelNum++;
        instructions.add( "CONTINUE" + labelNum + ": addiu $a2, $t6, 4" );
        instructions.add( "addiu $a2, $t6, 4" );
        instructions.add( "sw $a2 , 0($fp)");
        instructions.add( "addiu $fp, $fp, 4" );
    	instructions.add("#read completed");
        printNewLine();
    }
    public void generateWrite( Type type , int isLValue ){
        //System.out.println( "hello" );
    	instructions.add("#write started and its type is " + type.toString() );
    	if(type instanceof CharType){// it is assumed that head of stack is a \0 character
    		instructions.add("li $v0,11");
    		instructions.add( "lw $a0, -4($fp)");
            instructions.add( "lw $a0, 0($a0)");
            instructions.add("syscall");
    	}else if(type instanceof IntType){
    		instructions.add("li $v0,1");
            instructions.add( "lw $a0, -4($fp)");
            instructions.add( "lw $a0, 0($a0)");
            instructions.add("syscall");
    	}
    	else if(type instanceof CharArrayType){
            writeCharArray( type , isLValue );
    	}
        printNewLine();
    	instructions.add("#write complete");
        popStack();
    }
    public void printNewLine()
    {
        instructions.add( "#printing new line" );
        instructions.add( "li $a0, 10" );
        instructions.add( "li $v0, 11" );
        instructions.add( "syscall" );
    }
    public void writeCharArray( Type type , int isLValue )
    {
        instructions.add( "li $v0, 11" );
        instructions.add( "lw $a3, -4($fp)");
        int upOffset = 0;
        if( isLValue == 1 )
            upOffset = ( type.size() - Type.WORD_BYTES );
        else if( isLValue == 0 )
            upOffset = 0;
        //instructions.add( "addiu $a3, $a3, " + upOffset );
        instructions.add( "li $a2, " + ( type.size() / Type.WORD_BYTES ) );
        instructions.add( "li $a1, 0" );
        instructions.add( "LOOP" + labelNum + ": beq $a1, $a2, " + "CONTINUE" + ( labelNum + 1 ) );
        instructions.add( "lw $a0, 0($a3)");
        instructions.add( "syscall" );
        instructions.add( "addiu $a1, $a1, 1" );
        if( isLValue == 1 )
            instructions.add( "addiu $a3, $a3, -4" );
        else if( isLValue == 0 )
            instructions.add( "addiu $a3, $a3, 4" );
        instructions.add( "j LOOP" + labelNum);
        labelNum++;
        instructions.add( "CONTINUE" + ( labelNum ) + ": nop");
    }
}
