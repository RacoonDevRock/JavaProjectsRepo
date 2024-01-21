package TeatroBoleteria;
//como se implementan esos metodos de la interface
public class LinkedQueue<T> implements QueueADT<T> {
    
    private int count;
    private LinearNode<T> front;
    private LinearNode<T> rear;
  
    //Crea una cola vacia
    public LinkedQueue() {
        count = 0;
        front = rear = null;
    }
    
    //Agrega un elemento al final de la cola
    public void enqueue(T element){
        LinearNode<T> node = new LinearNode<T>(element);
        
        if (isEmpty( ))
            front = node;
        else
            rear.setNext (node);
        
        rear = node;
        count++;
    }
    
    //Remueve un elemento que esta en el frente de la cola y retorna una referencia
    public T dequeue(){
        
        if (isEmpty( ))
            System.out.println("Está vacía");
        T result = front.getElement( );
        front = front.getNext( );
        count--;
        if (isEmpty( ))
            rear = null;
        return result;
    }
    
    //Examina el elemento que esta en el frente de la cola
    public T first(){
        if(isEmpty())
                System.out.println("Cola vacía");
        return front.getElement();
    }
    
    //Determina si la cola esta vacia
    public boolean isEmpty(){
        return (front == null);
    }

    //Determina el numero de elementos de la cola
    public int size(){
        return count;
    }
    
    //Retorna una representacion en cadena de la cola
    public String toString(){
        String msg = "";
        LinearNode<T> act;
        act = front;
        for(int i = 0;  i < count; i++){
            msg = msg+ "\n" + act.getElement();
            act = act.getNext();
        }
        
        return msg;
    }
    
}
