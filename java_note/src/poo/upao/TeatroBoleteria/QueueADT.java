package poo.upao.TeatroBoleteria;

//qué metodos seran usados
public interface QueueADT<T> {
    //Agrega un elemento al final de la cola
    public void enqueue(T element);
    //Remueve un elemento que esta en el frente de la cola y retorna una referencia
    public T dequeue();
    //Examina el elemento que esta en el frente de la cola
    public T first();
    //Determina si la cola esta vacia
    public boolean isEmpty();
    //Determina el numero de elementos de la cola
    public int size();
    //Retorna una representacion en cadena de la cola
    @Override
    public String toString();
}
