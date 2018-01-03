public class NoType extends Type{

	public  int size(){
		return 0;
	}

	public boolean equals(Object other){
		if(other instanceof NoType)
			return true;
		return false;
	}

	public  String toString(){
		return "no_type";
	}
	public static NoType getInstance() {
		//if(instance == null)
			return /*instance = */new NoType();
		//return instance;
	}
}