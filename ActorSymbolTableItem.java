public class ActorSymbolTableItem extends SymbolTableItem {
	private SymbolTable sym;
	private int MailBoxSize;
	private String actorName;
	public ActorSymbolTableItem(SymbolTable con) {
		super();
		sym=con;
	}
	public SymbolTable getAccordingST(){
		return sym;
	}
	public void setActorMailBoxSize(int n) {//throws InvalidArgumentException{
		/*if(n<0)
			throw new InvalidArgumentException();*/
		MailBoxSize=n;
	}
	public int getActorMailBoxSize(){
		return MailBoxSize;
	}
	public void setActorName(String n){
		actorName=n;
	}
	public String getName(){
		return actorName;
	}
	public String getKey(){
		return "actor_"+actorName;
	}

}
