package structure_data.Queues.LinkedQueue;

public class LinkedQueueDemo {

    public static void main(String args[]) {
        System.out.println("SIMULACION DE UNA COLA DE NOMBRES");
        
        LinkedQueue<String> lq = new LinkedQueue<String>();
        
        lq.enqueue("Maria");
        lq.enqueue("Gladys");
        lq.enqueue("Serena");
        lq.enqueue("Emiliana");
        lq.enqueue("Marianella");
        

        System.out.println("\nEl nombre en el FRENTE de la cola es: " + lq.first());
        
        System.out.println("Número de nombres que han sido agregados(enqueue) a la cola es: "+ lq.size());
        
        System.out.println("\nContenido de la COLA lq via toString: "+ lq + "\n"); // todos derivan de Object(Clase padre)
        
        System.out.println("Contenido individualmente extraido (dequeue):");
        for(int i=0;i<=(2*lq.size())+2;i++){
                     System.out.print(lq.dequeue());
                     System.out.print(" ");
        }
        
        if (lq.isEmpty()==true)
        {
            System.out.println("\nLa cola ahora esta VACIA");
        }  
        
    }
}
