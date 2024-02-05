package structure_data.Stacks.Evaluator;

public class ArrayStack<E> implements StackADT<E>{
    private final int DEFAULT_CAPACITY = 100;
    private E[]stack;
    private int top;
    
    
    public ArrayStack(){
        top = 0;
        stack = (E[])(new Object[DEFAULT_CAPACITY]);
    }
    
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (E[])(new Object[initialCapacity]);
    }
    
    public void push (E dataItem) {
        if (top == stack.length)
            expandCapacity( );
        stack[top] = dataItem;
        top++;
    }
    
    public E pop( ) {
        if (top == 0)
            System.out.println("La Pila esta Vacia" );
            top--;
            E topItem = stack[top];
            stack[top] = null;
        return topItem;
       }
    
    public E peek( ) {
        if (top == 0)
            System.out.println("Pila vacia" );
        return stack[top-1];
    }
    
    public boolean isEmpty( ) {
        return (top == 0);
    }
    
    public int size( ) {
        return top;
    }
    
    public String toString( ) {
       String result = "Stack:\n";
        for (int index=0; index < top; index++)
            result = result + stack[index].toString( )
                + "\n";
        return result;
    }
}
