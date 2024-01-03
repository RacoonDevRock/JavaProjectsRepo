package PedidosDelivery;

public class Pedido {
  private Cliente clie;
  private Repartidor rep;
  private Producto prod;
  
  //Constructor Pedido(Parametros)
  public Pedido(Cliente clie, Repartidor rep, Producto prod){
    this.clie = clie;
    this.rep = rep;
    this.prod = prod;
  }
  
  //Métodos setter y getter
  public Cliente getClie(){
    return clie;
  }

  public void setClie(Cliente clie){
    this.clie = clie;
  }

  public Repartidor getRep(){
    return rep;
  }

  public void setRep(Repartidor rep){
    this.rep = rep;
  }

  public Producto getProd(){
    return prod;
  }

  public void setProd(Producto prod){
    this.prod = prod;
  }

  //Método toString
  public String toString(){
    return "\n[[[[[[---------]]]]]] BOLETITA UWU [[[[[[---------]]]]]]\n"+clie.toString()+rep.toString()+prod.toString();
  }
}