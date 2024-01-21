
package CafeElNegrito;

public class Leche extends ComplementosAgregados{

    Cafe bebida;

    //Se envuelve la variable bebida por medio del constructor
    public Leche(Cafe bebida, int X) {
        this.bebida = bebida;
    }
    
    //Concatenamos la descripcion de la bebida pedida junto al item que decora la misma
    public String getDescripcion(){
        return bebida.getDescripcion()+", Leche";
    }
    
    public double costo(int x){
        //x hace referencia al tamaño del producto
        
        double precio = bebida.costo(x);

        switch(x){
          case 1: //Tamño Normal
            precio = precio + 0.1;
          break;
          case 2: //Tamaño Mediano
            precio = precio + 0.15;
          break;
          case 3: //Tamaño Grande
            precio = precio + 0.20;
          break;     
        }
      
        return precio;
    }
    
}
