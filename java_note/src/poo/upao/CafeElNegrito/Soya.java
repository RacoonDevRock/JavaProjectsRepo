
package poo.upao.CafeElNegrito;

public class Soya extends ComplementosAgregados{

    Cafe bebida;

    //Se envuelve la variable bebida por medio del constructor
    public Soya(Cafe bebida, int X) {
        this.bebida = bebida;
      
    }
    
    //Concatenamos la descripcion de la bebida pedida junto al item que decora la misma
    public String getDescripcion(){
        return bebida.getDescripcion()+", Soya";
    }

   //
    public double costo(int x){
        //X hace referencia al tamaño del producto
        
        double precio = bebida.costo(x);

        switch(x){
          case 1: //Tamño Normal
            precio = precio + 0.15;
          break;
          case 2: //Tamaño Mediano
            precio = precio + 0.2;
          break;
          case 3: //Tamaño Grande
            precio = precio + 0.25;
          break;     
        }
      
        return precio;
    }
    
    
}
