import java.util.*;
public class ReceiverSymbolTableItem extends SymbolTableItem{
	public boolean isInit;
	public ReceiverSymbolTableItem() {
		super();
		isInit = false;
		arguments=new ArrayList<>();
		argumentsNames=new ArrayList<>();
	}
	String receiverName;
	ArrayList<Type> arguments;
	ArrayList<String> argumentsNames;
	public void addReceiverArgument(Type t,String name){
		arguments.add(t);
		argumentsNames.add(name);
	}
	public void setReceiverName(String n){
		receiverName=n;
	}
	public String getName(){
		return receiverName;
	}
	public String getKey(){
		String ret="receiver_"+receiverName + "_";
		for(int i=0;i<arguments.size();i++){
			ret+=arguments.get(i).toString() + " ";
		}
		return ret;
	}


}
