package poo.PedidosDelivery;

public class Cliente{
  private String nom_cli;
  private int Dni;
  private int Cel;
  
  //Constructor Cliente(Parametros)
  public Cliente(String nom_cli, int Dni, int Cel) {
    this.nom_cli = nom_cli;
    this.Dni = Dni;
    this.Cel = Cel;
  }

  //Métodos setter y getter
  public String getNombre(){
    return nom_cli;
  }

  public void setNombre(String nom_cli){
    this.nom_cli = nom_cli;
  }
 
  public int getDni(){
    return Dni;
  }

  public void setDni(int Dni){
    this.Dni=Dni;
  }

  public int getCelular(){
    return Cel;
  }
    
  public void setCelular(int Cel){
    this.Cel = Cel;
  }

  //Método toString
  public String toString(){
    return "\n ---DATOS DEL CLIENTE--- "+
    "\n  Nombre: "+getNombre()+
    "\n  DNI: "+getDni()+
    "\n  Celular: "+getCelular();
  }
}