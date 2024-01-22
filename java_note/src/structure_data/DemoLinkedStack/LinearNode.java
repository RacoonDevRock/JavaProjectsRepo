package structure_data.DemoLinkedStack;

public class LinearNode<T> { //elemento generico

    private LinearNode<T> next; // representa a los nodos (objetos creados)
    private T element; // representa a los elementos 
    
    public LinearNode( ) { // sirve de constructor
        next = null;
        element = null;
       // Tanto el nodo como el elemento estaran vacios
    }
    
    public LinearNode (T elm) { // sirve para almacenar los elementos dentro del nodo
        next = null;
        element = elm;
      // mientras el nodo no sufre cambio, el elemento obtenido se almacena
    }
    
    public LinearNode<T> getNext( ) { // sirve como metodo getter del nodo
        return next;
      // nos retorna el nodo
    }
    
    public void setNext (LinearNode<T> node) { // sirve como metodo setter del nodo
        next = node;
      // define al dato siguiente
    }
    
    public T getElement( ) { // sirve como metodo getter del elemento
        return element;
       // nos retorna el elemento
    }
    
    public void setElement (T elm) { // sirve como metodo setter del elemento
        element = elm;
      // almacena el elemento
    }
}
