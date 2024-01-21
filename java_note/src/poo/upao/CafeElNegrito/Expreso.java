
package poo.CafeElNegrito;

//
public class Expreso extends Cafe{

  Cafe bebida;
    
    //para manejar el atributo descripcion se desarrolla en el constructor
    public Expreso(){
        descripcion = "Cafe Expresso";
    }
    
    //Se retorna solo el precio de la bebida de acuerdo al pedido
  
    public double costo(int x){
        //X hace referencia al tamaño del producto
        
        double precio = bebida.costo(x);

        switch(x){
          case 1: //Tamño Normal
            precio = precio + 1.99;
          break;
          case 2: //Tamaño Mediano
            precio = precio + 2.09;
          break;
          case 3: //Tamaño Grande
            precio = precio + 2.15;
          break;     
        }
      
        return precio;
    }
    
}