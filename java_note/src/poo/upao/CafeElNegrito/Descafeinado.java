
package poo.CafeElNegrito;

public class Descafeinado extends Cafe{
    Cafe bebida;

    //para manejar el atributo descripcion se desarrolla en el constructor
    public Descafeinado() {
        descripcion = "Descafeinado";
    }
    
    //Se retorna solo el precio de la bebida de acuerdo al pedido
    public double costo(int x){
        //X hace referencia al tamaño del producto
        
        double precio = bebida.costo(x);

        switch(x){
          case 1: //Tamño Normal
            precio = precio + 1.05;
          break;
          case 2: //Tamaño Mediano
            precio = precio + 1.15;
          break;
          case 3: //Tamaño Grande
            precio = precio + 1.25;
          break;     
        }
      
        return precio;
    }
    
}