package PedidosDelivery;

public class Producto {
  private int ID;
  private String Tip_pag;
  private Double Precio;

  //Constructor Producto(Parametros)
  public Producto (int ID, String Tip_pag, Double Precio) {
    this.ID=ID;
    this.Tip_pag=Tip_pag;
    this.Precio=Precio;
  }

  //Métodos setter y getter
  public int getID() {
    return ID;
  }
    
  public void setID(int ID) {
    this.ID=ID;
  }

  public String getTip_pag() {
    return Tip_pag;
  }

  public void setTip_pag(String Tip_pag) {
    this.Tip_pag=Tip_pag;
  }

  public Double getPrecio() {
    return Precio;
  }

  public void setPrecio(Double Precio) {
    this.Precio=Precio;
  }

  //Método toString
  public String toString() {
    return  "\n ---DATOS DEL PRODUCTO--- "+
    "\n  ID: G08-"+ getID() +
    "\n  Tipo de pago: "+getTip_pag() +
    "\n  Precio: "+ getPrecio();
  }
}