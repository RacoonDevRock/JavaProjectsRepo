package structure_data.Stacks.DemoLinkedStack;

import java.util.EmptyStackException;
import java.util.concurrent.ExecutionException;

public abstract class LinkedStack<T> implements StackADT<T>{
    
    private int count; // tamaño de la pila
    private LinearNode<T> frente; // parte superior de la pila
  
    /*private class Node {
      private T result;
      private Node next;
      
    }*/
        
    public LinkedStack(){ // crea una pila
      // atributos 
        frente = null;
        count = 0;
    }

    public void push (T element){  // Agrega el elemento especificado a la parte superior de esta pila
        LinearNode<T> temp = new LinearNode<T> (element);
        temp.setNext(frente);
        frente = temp;
        count++;
    }
    
    public T pop( ) throws ExecutionException{ // Elimina el elemento en la parte superior de esta pila y devuelve un referencia
        if (isEmpty( )) // si la pila esta vacio.
            throw new ExecutionException("No se puede joven"); // Lanzado para indicar que no se puede realizar una operación en una colección vacía.
            T result = frente.getElement( );
            frente = frente.getNext( );
            count--;
            return result;
    }
    
    public T peek(){ //Devuelve una referencia al elemento en la parte superior de esta pila.
        if (isEmpty()) 
          throw new EmptyStackException("No se puede joven");
        return frente.element;
    }
    
    public boolean isEmpty(){ // limpia la pila (Devuelve verdadero si esta pila está vacía y falso en caso contrario.)
        return frente == null;
    }
    
    public int size(){ // Devuelve el número de elementos en la pila.
        return count;
    }

    public String toString(){ // Devuelve una representación de cadena de esta pila.
        LinearNode<T> actual = frente;
        String pila ="";
        for(int i = 0; i < size(); i++){
            pila = pila + "\n" + actual.getElement();
        }
        return pila;
    }
}
