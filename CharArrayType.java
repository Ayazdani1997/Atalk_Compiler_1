import java.util.*;
public class CharArrayType extends ArrayType {
	public CharArrayType(){
		size=Type.WORD_BYTES;
		dimensions=new ArrayList<>();
	}
	@Override
	public boolean equals(Object other) {
		//System.out.println( "equal is running" );
		if(other instanceof CharArrayType)
		{
			if( ( ( CharArrayType ) other ).DimensionsCount() != dimensions.size() )
				return false;
			for( int i = 0 ; i < dimensions.size() ; i++ )
				if( dimensions.get( i ) != ( (CharArrayType) other ).getDimensionSize( i ) )
					return false;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "char_array";
	}
	public static CharArrayType getInstance() {
		//if(instance == null)
			return /*instance = */new CharArrayType();
		//return instance;
	}
}
