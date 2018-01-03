import java.util.*;

public class ArrayType extends Type{
	public ArrayType(){
		size=WORD_BYTES;
		dimensions=new ArrayList<>();
	}
	@Override
	public int size() {
		return size;
	}
	int size;

	public boolean equals(Object other) {
		if(other instanceof ArrayType)
			return true;
		return false;
	}

	public String toString(){
		return "array_type";
	}
	protected ArrayList<Integer> dimensions;
	void pushNewDimension(int d){
		dimensions.add(d);
		size*=d;     
	}
	void pushNewDimensionToFirst( int d )
	{
		dimensions.add( 0 , d );
		size*=d;
	}
	public int DimensionsCount(){
		return dimensions.size();
	}
	public ArrayList<Integer> getDimensions(){
		return dimensions;
	}
	public int getDimensionSize( int dim )
	{	
		if( dim < dimensions.size()  )
			return dimensions.get( dim );
		return -1;
	}
	public int getDimensionByteCount( int dimNum )
	{
		int wordCount = size;
		for( int i = 1 ; i <= dimNum ; i++ )
			wordCount = wordCount / dimensions.get( i - 1 );
		return wordCount;
	}
	public void pushNewDimensions(ArrayList<Integer> d){
		//dimensions.addAll(d);
		size = WORD_BYTES;
		for( int i = 0 ; i < d.size() ; i++ )
		{
			size *= d.get( i );
			dimensions.add( d.get( i ) );
		}	
	}
}