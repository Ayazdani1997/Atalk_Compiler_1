/**
 * Created by vrasa on 12/26/2016.
 */

import java.util.*;
import java.io.*;

public class Translator 
{
    private int labelNum;
    private int receiverNum;
    private Hashtable<String,Integer> actorsMemoryAddresses;
    private Hashtable<String,Hashtable<String,Integer>> receiverNumbers;
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
        stackstart = 0x7ffff148;
        heapstart  = 0x10011111;
        actorSegmentStart= 0x11011111;
        dataSegmentStart= 0x00001000;
        argumentStart = 0x10002000;
        rvalueStackStart = 0x7ffffffc;
	    actorsMemoryAddresses=new Hashtable<>();
	    receiverNumbers=new Hashtable<>();// String:actor name
        instructions = new ArrayList<String>();
        initInstructions = new ArrayList<String>();
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
        actorsMemoryAddresses.put(name,t1offset);
        receiverNumbers.put(name,new Hashtable<>());
            initInstructions.add("# adding an actor");
        if(SymbolTable.top.actorHasInit()){
            initInstructions.add("li $a0, " + (mailboxSize-1));//because of init msg
            initedActorsCount++;
        }
        else
            initInstructions.add("li $a0, " + mailboxSize);     
            initInstructions.add("sw $a0, " + t1offset + "($t1)");
        t1offset+=4;
            initInstructions.add("move $t3,$t1");
            initInstructions.add("addi $t3,$t3, "+(t1offset+8));
            initInstructions.add("sw $t3, "+t1offset+"($t1)");//read pointer tanzim mishavad
        t1offset+=4;
            if( !SymbolTable.top.actorHasInit() || mailboxSize==1){
                initInstructions.add("move $t3,$t1");
                initInstructions.add("addi $t3,$t3, "+(t1offset+4));
                initInstructions.add("sw $t3, "+t1offset+"($t1)");//write pointer tanzim mishavad
        }else{
                initInstructions.add("move $t3,$t1");
                initInstructions.add("addi $t3,$t3, "+(t1offset+20));
                initInstructions.add("sw $t3, "+t1offset+"($t1)");//write pointer tanzim mishavad
        }
        t1offset+=4;
        t1offset+=mailboxSize*16;
    }
    public void addReceiver(String name)
    {
        String actorName=((ActorSymbolTableItem)SymbolTable.top.pre.pre.getInCurrentScope(SymbolTable.top.pre.getkeyOfActorAccordingToActorST())).getName();
        receiverNumbers.get(actorName).put(name,receiverNum);
        instructions.add(name+receiverNum+":");
        if(SymbolTable.top.isInitReceiverScope){//putting init message
            initInstructions.add("li $t3, "+actorsMemoryAddresses.get(actorName)+"($t1)");
            initInstructions.add("sw $zero , 20($t3)");
            initInstructions.add("li $t5, "+receiverNum);
            initInstructions.add("sw $t5 , 24($t3)");
        }
        receiverNum++;
    }
	public void addReceiverSkeleton(){
		initInstructions.add("jr $ra");
	}
    public void makeOutput(){
            //this.addSystemCall(10);
            try {
                PrintWriter writer = new PrintWriter(output);
                //writer.println("invalidmsgmsg : "+".asciiz \"InvalidMessageError\"");
                //writer.println("actorMBfullmsg : "+".asciiz \"ActorBufferOverflowError\"");
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

    		   //makeSuperWhile();

    		   //messagePicker();
                for (int i=0;i<instructions.size();i++){
                    writer.println(instructions.get(i));
                }
                writer.println("programcomplete:");
                addSystemCall(10);//Exit program
                writer.close();
            } catch (Exception e) { e.printStackTrace(); }
    }
    public void messagePicker(){//$a0 <- absolute address of the actor data segment , $a1 <- actor mailbox size
        instructions.add("messagepicker:");
        instructions.add("bne $a1,$a0, hasmessage"+labelNum);
        instructions.add("jr $ra");
        instructions.add("hasmessage"+labelNum+" :");
        labelNum++;
        instructions.add("lw $a2, 0($a0)");//
        instructions.add("addiu $a2,$a2,-1");//zarfiate queue yeki kam mishe
        instructions.add("sw $a2, 0($a0)");//
        instructions.add("addiu $t8,$t8,-1");//te'edade kolle payam ha yeki kam mishe
        instructions.add("lw $a2, 4($a0)");//$a2<-absolute addresse oon sloti ke payami ke bayad bekhonim tooshe
        instructions.add("lw $a3, 4($a0)"); 
        instructions.add("addi $a3,$a3,16");
        instructions.add("li $t3,16");
        instructions.add("multu $t3,$a1");
        instructions.add("mflo $t3");
        instructions.add("add $t3,$t3,$a0");
        instructions.add("addi $t3,$t3,8");
        instructions.add("remu $a3,$a3,$t3");
        instructions.add("beq $a3,$zero, "+"pointermending"+labelNum);
        instructions.add("sw $a3,4($a0)");//read pointer miravad roo slote baadi
        instructions.add("j pointermended"+(labelNum+1));
        instructions.add("pointermending"+labelNum+" :");
        labelNum++;
        instructions.add("addi $a3,$a0,12");
        instructions.add("sw $a3,4($a0)");//read pointer miravad roo slote baadi (ya een ejra mishavad ya balaii)
        instructions.add("pointermended"+labelNum+" :");
        instructions.add("addi $t3,$a2,12");
        instructions.add("lw $t3, 0($t3)");//$t3 <- shomare receiveri ke bayad be kode an beparim.
        String aName,rName;
        Enumeration aNames= actorsMemoryAddresses.keys();
        Enumeration rNames;
        while(aNames.hasMoreElements()){
          aName=(String) aNames.nextElement();
            instructions.add("li $t5, "+actorsMemoryAddresses.get(aName));
             instructions.add("add $t5,$t5,$t1");
            instructions.add("bne $t5,$a0, not"+labelNum+aName);
             rNames=receiverNumbers.get(aName).keys();
             while(rNames.hasMoreElements()){
              rName=(String) rNames.nextElement();
             instructions.add("li $t7, "+receiverNumbers.get(aName).get(rName));
              instructions.add("beq $t7,$t3 , "+rName+receiverNumbers.get(aName).get(rName));
            }
        //agar hameye beq ha ra rad konad che?
            instructions.add("not"+labelNum+aName+":");
            labelNum++;
        }
    //  vaziiate ajib .adade receiver male hichkodam az actor ha naboode che konim? 
    }
    /*public void addRvalueToStack(int x){
        instructions.add("# adding a number to stack");
        instructions.add("li $a0, " + x );
        instructions.add("sw $a0, 0($fp)");
        instructions.add("addi $fp, $fp, 4");
        instructions.add("# end of adding a number to stack");

    }*/
    public void makeSuperWhile(){
        instructions.add("superwhile"+labelNum+" :");
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
        instructions.add("j superwhile"+labelNum);
        labelNum++;
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
//      System.out.println( "pushing to stack");
//      int adr = table.getAddress(s)*(-1);
        //int size = item.getVariable().size();
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
    public void generateAccessCode( int size , SymbolTableTemporaryVariableItem array )
    {
        instructions.add( "#Accessing an element" );
        instructions.add("#of array " + array.getVariable().getName() );
        instructions.add( "li $a1 , 0" );
        //int size = indices.size();
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

    /*public void addLvalueAddressToStack( String name , Register base , int adr ){
//      System.out.println( "pushing to stack");
//      int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding variable " + name + " to stack");
        instructions.add("lw $a0, " + adr + "(" + base.toString() + ")");
        instructions.add("sw $a0, 0($fp)");
        instructions.add("addi $fp, $fp, 4");
        instructions.add("# end of adding variable " + name + " to stack\n");
    }*/


    /*public void addAddressToStack(String s, int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding address to stack");
        instructions.add("addiu $a0, $fp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding address to stack");
    }*/

    /*public void addGlobalAddressToStack(String s, int adr){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global address to stack");
        instructions.add("addiu $a0, $gp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global address to stack");
    }*/

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
    }/*

    public void assignCommand(){
        instructions.add("# start of assign");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("sw $a0, 0($a1)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        popStack();
        instructions.add("# end of assign");
    }*/

    public void generateCodeForNonEqualityBinaryArithmetic( String s )
    {
        Hashtable<String,String> opHash = new Hashtable<String,String>();
        opHash.put( "+" , "add" );
        opHash.put( "-" , "sub" );
        opHash.put( "*" , "mul" );
        opHash.put( "/" , "div");
        opHash.put( "<" , "slt");
        opHash.put( ">" , "slt" );
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

    public void generateCodeForEquality( String operator , SymbolTableTemporaryVariableItem t1 , SymbolTableTemporaryVariableItem t2 )
    {
        Hashtable<String,String> opHash;
        opHash.put( "==" , "xor" );
        opHash.put( "<>" , "xor");
        opHash.put( ">" , "slt" );
        opHash.put( "<" , "slt" );
        int incValue1 = -4 , incValue2 = -4;
        if( t1.isLValue == 0 )
            incValue1 = 4;
        if( t2.isLValue == 0 )
            incValue2 = 4;
        instructions.add( "lw $s3, -4($fp)");
        popStack();
        instructions.add( "lw $s2, -4($fp)" );
        instructions.add( "li $a1, 0" );
        instructions.add( "li $a0, " + t1.getVariable().size() );
        instructions.add( "LOOP" + labelNum + ": beq $a1, $a0, CONTINUE" + ( labelNum + 1 ) );
        instructions.add( "lw $s0, 0($s2)");
        instructions.add( "lw $s1, 0($s3)");
        instructions.add( "xor $s5, $s0, $s1" );
        instructions.add( "and $s4, $s4, $s5" );
        instructions.add( "addiu $a1, $a1, 1" );
        instructions.add( "addiu $s2, $s2, " + incValue1 );
        instructions.add( "addiu $s3, $s3, " + incValue2 );
        instructions.add( "j LOOP" + labelNum );
        labelNum++;
        instructions.add( "CONTINUE" + labelNum + ": nop" );
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
   	}

    public void operationCommand(String s) {
        instructions.add("#operation " + s);
        if (s.equals("*") || s.equals("/") || s.equals( "+" ) || s.equals( "-" ) || s.equals( ">") 
        || s.equals( "<" ) || s.equals( "and" ) || s.equals( "or" ) )
            generateCodeForNonEqualityBinaryArithmetic( s );
        /*else if(s.equals("<>")){
            instructions.add("lw $a0 ,0($fp)");
            popStack();
            instructions.add("lw $a1, 0($fp)");
            popStack();
            instructions.add("bne $a1,$a0, "+labelNum+"true");
            instructions.add("sw $zero , 0($fp)");
            instructions.add("add $fp,$fp,4");
            instructions.add("j "+labelNum+"cmpcomplete");
            instructions.add(labelNum+"true:");
            instructions.add("addi $t5,$zero, 1");
            instructions.add("sw $t5, 0($fp)");
            instructions.add("add $fp,$fp,4");
            instructions.add(labelNum+"cmpcomplete:");
            labelNum++;
       }*//*else if(s.equals("==")){
            instructions.add("lw $a0 ,0($fp)");
            popStack();
            instructions.add("lw $a1, 0($fp)");
            popStack();
            instructions.add("beq $a1,$a0, "+labelNum+"true");
            instructions.add("sw $zero, 0($fp)");
            instructions.add("add $fp,$fp,4");
            instructions.add("j "+labelNum+"cmpcomplete");
            instructions.add(labelNum+"true:");
            instructions.add("addi $t5, $zero, 1");
            instructions.add("sw $t5, 0($fp)");
            instructions.add("add $fp,$fp,4");
            instructions.add(labelNum+"cmpcomplete:");
            labelNum++;
        }*/
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
