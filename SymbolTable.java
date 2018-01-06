import java.util.*;

public class SymbolTable  {

	// Static members region
	public static SymbolTable top;
	public boolean inForeachST;
	public boolean firstForeachST;
	public boolean isArrayID;
	private static Stack<SymbolTable> stack = new Stack<SymbolTable>();
	
	private static Queue<SymbolTable> queue = new LinkedList<SymbolTable>();

	private static int definitionsCount = 0;
	private boolean ActorSThasMethodInit;
	public boolean actorHasInit()
	{
		return ActorSThasMethodInit;
	}
	public void actorSetHasInit()
	{
		ActorSThasMethodInit = true;
	}

	// Use it in pass1 scope start
	public static void push(SymbolTable symbolTable) {
		if(top != null)
		{
			//System.out.println( "before push : " + top.items + "\n" + top.offsets );
			stack.push(top);
		}
		top = symbolTable;
		//System.out.println( "after push : " + top.items + "\n" + top.offsets );
		queue.offer(symbolTable);
	}

	// Use it in pass1, pass2 scope end
	public static void pop() {
		//System.out.println( "before pop : " + top.items + "\n" + top.offsets );
		top = stack.pop();
		//System.out.println( "after pop : " + top.items + "\n" + top.offsets );
	}

	// Use it in pass2 scope start
	public static void push() {
		push(queue.remove());
	}

	// Use it in pass2, where an item with property "defMustBeComesBeforeUse == true" is defined
	public static void define() {
		++definitionsCount;
	}

	// End of static members region

	public SymbolTable() {
		this(null);
	}
	public void setInForeachST(){
		firstForeachST = true;
		inForeachST = true;
	}
	public void setIsArrayID()
	{
		isArrayID = true;
	}
	public boolean getIsArrayID()
	{
		return isArrayID;
	}
	public boolean getInForeachST(){
		return inForeachST;
	}
	public boolean isFirstForeach()
	{
		return firstForeachST;
	}
	public SymbolTable(SymbolTable pre) {
		firstForeachST = false;
		isArrayID = false;
		this.pre = pre;
		if( pre ==null )
			inForeachST=false;
		else if( pre.inForeachST )
			inForeachST=true;
		else
			inForeachST=false;
		this.items = new HashMap<String, SymbolTableItem>();
		this.offsets = new HashMap<Register, Integer>();
		isInitReceiverScope=false;
	}

	public void put(SymbolTableItem item) throws ItemAlreadyExistsException{
		//System.out.println( "put is running" );
		if(items.containsKey(item.getKey()))
			throw new ItemAlreadyExistsException();
		items.put(item.getKey() , item );
		if(item instanceof SymbolTableVariableItemBase) {
			SymbolTableVariableItemBase castedItem = (SymbolTableVariableItemBase) item;
			setOffset( castedItem.getBaseRegister(), getOffset(castedItem.getBaseRegister()) + castedItem.getSize() );
			//System.out.println( offsets.get( castedItem.getBaseRegister() ) );
		}
	}

	public int getOffset(Register baseRegister) {
		if(!offsets.containsKey(baseRegister))
		   return 0;
		return offsets.get(baseRegister);
	}

	public void setOffset(Register baseRegister, int value) {
		offsets.put(baseRegister, value);
	}

	public SymbolTableItem getInCurrentScope(String key) {
		//System.out.println( items );
		return items.get(key);
	}

	public SymbolTableItem get(String key) {
		//System.out.println( "get is running" );
		//System.out.println(items);
		SymbolTableItem value = items.get(key);
		if(value == null && pre != null){
			//System.out.println("inside"+key);
			return pre.get(key);
		}
		if( value != null )
		{
			//System.out.println( "Symbol Table definition count is " + SymbolTable.definitionsCount + " and value counter is " + value.getDefinitionNumber() );
			if(value.useMustBeComesAfterDef() && SymbolTable.definitionsCount <= value.getDefinitionNumber()) {
				//System.out.println( "hello" );
				if(pre != null) 
					return pre.get(key);
				else 
					return null;
			}
		}

		return value;
	}

	public SymbolTable getPreSymbolTable() {
		return pre;
	}
	public int size(){
		return items.size();
	}
	public boolean contains(String key){
		if(items.get(key)==null)
			return false;
		else
			return true;
	}
	public String getkeyOfReceiverAccordingToReceiverST(){
		return keyOfReceiverIfIsAnReceiverST;
	}
	public void setkeyOfReceiverAccordingToReceiverST(String s){
		keyOfReceiverIfIsAnReceiverST=new String(s);
	}
	public String getkeyOfActorAccordingToActorST(){
		return keyOfActorIfIsAnActorST;
	}
	public void setkeyOfActorAccordingToActorST(String s){
		keyOfActorIfIsAnActorST=new String(s);
	}
	public void clearItems()
	{
		items = new HashMap<>();
	}
	private String keyOfActorIfIsAnActorST;
	private String keyOfReceiverIfIsAnReceiverST;
	private int StackOffsetBeforeForeachST;
	public void setStackOffsetBeforeForeachST(int o){StackOffsetBeforeForeachST=o;}
	public int getStackOffsetBeforeForeachST(){return StackOffsetBeforeForeachST;}
	public boolean isInitReceiverScope;
	SymbolTable pre;
	HashMap<String, SymbolTableItem> items;
	HashMap<Register, Integer> offsets;
}
