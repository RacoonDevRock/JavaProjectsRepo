package poo.PedidosDelivery;

import java.io.*;

public class PruebaF {

  //Variables de Conexion
  static Registro clie = new Registro();
  static Registro rep = new Registro();
  static Registro prod = new Registro();
  static Registro ped = new Registro();
  static Cliente c;
  static Repartidor r;
  static Producto p;
  static Pedido PI;
   
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{

    //VARIABLES
    int opc, n=0;
      do{ 
        opc=menu();  
        switch(opc) {
          case 1: n=leer();
                  Agregar(n);
                  break;
          case 2: reportar(n);
                  break;
          case 3: monitorear();
                  break;
          case 4: Cerrar();
                  break;
        }
      }while(opc!=4);
          
  }//Cierre main


  //METODOS DEL SWITCHCASE
  public static int menu()throws IOException{
    int opc;
    do{ 
      System.out.println("\n*******MENU OPCIONES RESTAURANT DELIVERY*******");
      System.out.println("1. Agregar pedido");
      System.out.println("2. Reportar pedido");
      System.out.println("3. Estado del pedido");
      System.out.println("4. Cerrar");     

      System.out.print("Ingrese la opcion: ");
      opc=Integer.parseInt(br.readLine());

    } while(opc<1 || opc >4);
    return opc;
  }

  static int leer() throws IOException{
    int n;
    do{        
      System.out.print("\nIngrese N° de Pedidos: ");
      n=Integer.parseInt(br.readLine());
    } while(n<1||n>5);
    return n;
  }

  static void Agregar(int n)throws IOException{
    String Nom_cli, Nom_rep, Zona, Tip_pag;
    int Dni, Cel, ID, i;
    Double Precio;

    System.out.println("\n********Ingreso de Datos de Pedidos*******");

    for(i=0; i<n; i++){

      System.out.print("\nNombre del Cliente: ");
      Nom_cli = br.readLine().toUpperCase();
      Dni = (int)(Math. random()*100000000+1);
      do{
        System.out.print("Celular(9 digitos): ");
        Cel = Integer.parseInt(br.readLine());
      } while(Cel<899999999 || Cel>999999999);

      //
      c = new Cliente(Nom_cli, Dni, Cel);
      clie.AgregarCli(c);          
          
      System.out.print("\nNombre del Repartidor: ");
      Nom_rep = br.readLine().toUpperCase();
      System.out.print("Zona: ");
      Zona = br.readLine().toUpperCase();
 
      //
      r = new Repartidor(Nom_rep, Zona);
      rep.AgregarRep(r);

      //
      ID = (int)(Math.random()*10000+1);


      System.out.print("\nTipo de pago (Tarjeta / efectivo): ");
      Tip_pag = br.readLine();
      

      System.out.print("Precio: ");
      Precio = Double.parseDouble(br.readLine());

      //
      p = new Producto(ID, Tip_pag, Precio);
      prod.AgregarPro(p);

      //
      PI = new Pedido(c, r, p);
      ped.AgregarPed(PI);
      
      System.out.println("<<<<<<<<<<<<<<<<PEDIDO AGREGADO U//w//U>>>>>>>>>>>>>>>>>>>>");
        
    }
  }

  static void reportar(int n){
    System.out.println(ped.Listar());
  }

  static void monitorear(){
    System.out.println(clie.MonitorPed());
  }

  public static void Cerrar()throws IOException{
    System.out.println("Gracias por usar este programa, espero tenga buen dia:) ...");
  }
}