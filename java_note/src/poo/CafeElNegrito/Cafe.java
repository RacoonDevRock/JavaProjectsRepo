package CafeElNegrito;

public abstract class Cafe {
    
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String descripcion = "Bebida desconocida";
    
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setSize(Size size){
        this.size = size;
    }
    
    public Size getSize(){
        return this.size;
    }
    
    public abstract double costo(int x);
 
}