import java.util.*;
public class IntArrayType extends ArrayType {
	public IntArrayType(){
		size=Type.WORD_BYTES;
		dimensions=new ArrayList<>();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof IntArrayType)
		{
			if( ( ( IntArrayType ) other ).DimensionsCount() != dimensions.size() )
				return false;
			for( int i = 0 ; i < dimensions.size() ; i++ )
				if( dimensions.get( i ) != ( ( IntArrayType ) other ).getDimensionSize( i ) )
					return false;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "int_array";
	}
	
	public static IntArrayType getInstance() {
		//if(instance == null)
			return /*instance =*/ new IntArrayType();
		//return instance;
	}
}
