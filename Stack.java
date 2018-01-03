import java.util.*;

class Stack<E> {
  private int top;
  private ArrayList<E> elements;

  public Stack() {
    top = -1;
    elements = new ArrayList<E>();
  }

  public E topOfStack()
  {
    E e;
    if( top > -1 )
    {
      e = elements.get( top );
      return e;
    }
    else
      return null;
  }

  public void push(E pushValue) {
    //System.out.println( "before push : " + elements‌ + " and top of stack is " + top );
    elements.add( pushValue);
    ++top;
    //System.out.println( "after push : " + elements‌ + " and top of stack is " + top );
  }

  public E pop() {
    //System.out.println( "before pop : " + elements‌ + " and top of stack is " + top );
   if (top == -1)
      return null;
    --top;
    E e = elements.get(top + 1);
    elements.remove(top + 1);
    return e;
  }
}
