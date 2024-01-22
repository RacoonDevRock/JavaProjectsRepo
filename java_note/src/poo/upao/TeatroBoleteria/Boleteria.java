package poo.upao.TeatroBoleteria;

public class Boleteria {

    private static final int NUM_CLIENTES = 100;
    private static final int MAX_BOLETERIAS = 15;
    private static final int TIEMPO_PROCESAMIENTO = 120;
    private static LinkedQueue<Cliente> cola = new LinkedQueue<>();  
    
    public static void main(String args[]) {
                        
        
        for(int i = 0; i < MAX_BOLETERIAS; i++){
            
            for(int j = 0;  j < NUM_CLIENTES; j ++){
            
              
                cola.enqueue(new Cliente(j*15));
            
            
            
            }
            
            for(int k = 0;  k < i; k ++){
                
                
                
            }
        
            System.out.println("" );
            
        }

    
        
        System.out.println("\nTiempo promedio: " );
    }
}