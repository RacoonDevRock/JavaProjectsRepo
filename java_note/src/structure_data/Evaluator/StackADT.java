package Evaluator;

public interface StackADT<E>{
    
    public void push(E dataItem);
    
    public E pop();
    
    public E pook();
    
    public boolean isEmpty();
    
    public int size();
    @Override
    public String toString();
    
    public int evaluar();
    
}
