package poo.upao.TeatroBoleteria;

public class LinearNode<T> { //<T>Generico para reutilizar code donde no tiene // restricciones de denominación.
   //Variables tipo private
   private LinearNode<T> next; //almacen de nodos
   private T element;//almacen generico de tipo E
    
   //Constructor
    public LinearNode() {
        //Iguala a null es decir ambas variables estan vacías
        next = null;
        element = null;
    }
    
    //Método de almacenamiento
    public LinearNode(T elem){
        next = null;
        element = elem;//guarda el valor
    }
    
    //Retorna el nodo siguiente
    public LinearNode<T> getNext(){
        return next;
    }
    
    public void setNext(LinearNode<T> node){
        next = node;//permite deifnir el dato siguiente
    }
    
    //Metodo del elemento genérico
    public T getElement(){
        //retorno del elemento
        return element;
    }
    
    //Metodo del elemento genérico
    public void setElement(T elem){
        element = elem;//iguala el dato del elem en element
    }
}