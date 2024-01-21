
package poo.CafeElNegrito;


//Extiende la clase cafe para asi poder intercambiar los complementos
//Se extiende cafe para los complementos
public abstract class ComplementosAgregados extends Cafe{
    
    
    //Sirve para la reimplementacion del metodo por cada decorador comple.
    public Cafe bebida;
    public abstract String getDescripcion();
    
    public Size getSize(){
        return bebida.getSize();
    }
}
