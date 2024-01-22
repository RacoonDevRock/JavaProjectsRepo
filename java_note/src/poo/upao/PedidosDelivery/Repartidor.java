package poo.upao.PedidosDelivery;

public class Repartidor {
  private String Nom_rep;
  private String Zona;
  
  //Constructor Repartidor(Parametros)
  public Repartidor(String Nom_rep, String Zona){
    this.Nom_rep = Nom_rep;
    this.Zona = Zona;
  }

  //Métodos setter y getter
  public String getNomRep(){
    return Nom_rep;
  }

  public void setNomRep(String Nom_rep){
    this.Nom_rep = Nom_rep;
  }

  public String getZona(){
    return Zona;
  }
  
  public void setZona(String Zona){
    this.Zona = Zona;
  }

  //Método toString 
  public String toString(){
    return  "\n ---DATOS DEL REPARTIDOR--- "+
    " \n  Nombre: "+ getNomRep() +
    " \n  Zona: "+ getZona();
  } 
}
  