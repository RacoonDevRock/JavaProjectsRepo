package structure_data.LinkedQueue;

public class LinearNode<E> {
   //Variables tipo private
   private LinearNode<E> next; //almacen de nodos
   private E element;//almacen generico de tipo E
    
   //Constructor
    public LinearNode() {
        //Iguala a null es decir ambas variables estan vacías
        next = null;
        element = null;
    }
    
    //Método de almacenamiento
    public LinearNode(E elem){
        next = null;
        element = elem;//guarda el valor
    }
    
    //Retorna el nodo siguiente
    public LinearNode<E> getNext(){
        return next;
    }
    
    
    public void setNext(LinearNode<E> node){
        next = node;//permite deifnir el dato siguiente
    }
    
    //Metodo del elemento genérico
    public E getElement(){
        //retorno del elemento
        return element;
    }
    
    //Metodo del elemento genérico
    public void setElement(E elem){
        element = elem;//iguala el dato del elem en element
    }
}