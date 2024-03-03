package poo.upao.PedidosDelivery;

//Llamamos a las librerias y estas agrupan al conjunto de clases e interfaces necesarios para procesar los archivos. 
import java.util.*;
//Comparable contiene una método abstracta compareTo el cual permite ordenar un objeto según un atributo especificado (String, Double, Integer, Int).
@SuppressWarnings("rawtypes")
public class Registro implements Comparable{

  //HashSet contiene un conjunto de objetos, pero de una manera que le permite determinar fácil y rápidamente si un objeto ya está en el conjunto o no.
  private HashSet<Pedido>ped;
  private HashSet<Cliente>clie;
  private HashSet<Repartidor>rep;
  private HashSet<Producto>prod;

  public Registro(){
    ped = new HashSet<Pedido>();
    clie = new HashSet<Cliente>();
    rep = new HashSet<Repartidor>();
    prod = new HashSet<Producto>();
  }

  //Métodos agregar
  public String AgregarCli(Cliente c){
    clie.add(c);
    return c.toString();
  }

  public String AgregarRep(Repartidor r){
    rep.add(r);
    return r.toString();
  }

  public String AgregarPro(Producto p){
    prod.add(p);
    return p.toString();
  }

  public void AgregarPed(Pedido PI){
    ped.add(PI);
  }

  //Método Listar
  public String Listar(){
    String cad = "";
    for(Pedido PI : ped){
      cad = cad + PI.toString() +"\n";
    }
    return cad;
  }

  //Método MonitorPed
  public boolean MonitorPed(){
    int t, i=1;
    for(Cliente c: clie){
      t = (int)(Math.random()*20+1);
      System.out.println("\n>>>> Pedido "+(i++)+" >>>> Cliente: "+c.getNombre()+" el pedido llegará en "+t+" minutos...");
    }
    return true;
  }
    
  public int compareTo(Object Obj) {
    Pedido PI = (Pedido) Obj;
    return PI.toString().compareTo(PI.toString());
  }
}