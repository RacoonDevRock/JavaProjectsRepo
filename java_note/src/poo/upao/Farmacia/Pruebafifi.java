package poo.Farmacia;

import java.io.*;
import java.util.*;

public class Pruebafifi {

  static Inventario hst = new Inventario();
  static Inventario tsh = new Inventario();
  static Producto p;
  static Inventario i;
  static Venta v;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // VARIABLES
    String rpta1, rpta2, rpta3;
    int opc;

    System.out.println("----- Bienvenido ADMIN -----");

    Producto p1 = new Producto("001", "PARACETAMOL", "250ml", "Laboratorios Baxter", 100, 75.50);
    Producto p2 = new Producto("002", "DICLOFENACO", "50g", "Química Suiza", 100, 60);
    Producto p3 = new Producto("003", "TOALLAS HIGIENICAS", "20 unidades", "Nosotras", 100, 11.50);

    // Venta v = new Venta(9, p1);
    hst.agregarPro(p1);
    hst.agregarPro(p2);
    hst.agregarPro(p3);

    System.out.println("\n¿Desea listar los productos del inventario?");
    System.out.println("SI          NO");
    do {
      System.out.print("Respuesta: ");
      rpta1 = br.readLine().toUpperCase();
    } while (!rpta1.equals("SI") && (!rpta1.equals("NO")));

    if (rpta1.equals("SI")) {
      System.out.println("\n-----INVENTARIO-----");
      System.out.println(hst.listarPro());
    }

    Venta v1 = new Venta(65, p1);
    Venta v2 = new Venta(10, p2);
    Venta v3 = new Venta(19, p3);

    // Venta v = new Venta(9, p1);
    tsh.agregarVent(v1);
    tsh.agregarVent(v2);
    tsh.agregarVent(v3);


    System.out.println("\n¿Desea listar los productos vendidos?");
      System.out.println("SI          NO");
      do {
        System.out.print("Respuesta: ");
        rpta2 = br.readLine().toUpperCase();
      } while (!rpta2.equals("SI") && (!rpta2.equals("NO")));

      if (rpta2.equals("SI")) {
      System.out.println("\n-----INVENTARIO-----");
      System.out.println(tsh.listarVent());
    }

    System.out.println("\n¿Desea realizar algún cambio?");
        System.out.println("SI          NO");
        do{
          System.out.print("Respuesta: ");
          rpta3=br.readLine().toUpperCase();
        }while(!rpta3.equals("SI") && (!rpta3.equals("NO")));

        if(rpta3.equals("SI")){

          do{ 
            opc=this.menu();  
            switch(opc) {
                case 1: leer();
                        Agregar(N);
                        break;
                case 2: Consultar();
                        break;
                case 3: Eliminar();
                        break;
                case 4: Cerrar();
                        break;
              }
          }while(opc!=4);
        }
        else{
          System.out.println("----- Sesión finalizada -----");
        }

        static int menu()throws IOException{
        int opc;
        do{ 
            System.out.println("\n*****MENU OPCIONES*****");
            System.out.println("1. Agregar dato");
            System.out.println("2. Consultar dato");
            System.out.println("3. Eliminar dato");
            System.out.println("4. Cerrar");     
            System.out.print("Ingrese la opcion:");
            opc=Integer.parseInt(br.readLine());
        }while(opc<1 || opc >4);
        return opc;
       }

       static int leer() throws IOException{
        int N;
        do{        
          System.out.println("Ingrese N° de objetos: ");
          N=Integer.parseInt(br.readLine());
        }while(N<1||N>10);

        return N;
      }

      static int Agregar(int N)throws IOException{
        String id, nom_prod, contenido, lab;
        int cant_tot, i;
        double precio;

        System.out.println("Ingreso de Datos");

        for(i=0;i<n;i++);
          System.out.print("ID: ");
          id=br.readLine();
          System.out.print("Nombre: ");
          nom_prod=br.readLine().toUpperCase();
          System.out.print("Contenido: ");
          contenido=br.readLine().toUpperCase();
          System.out.print("Laboratorio/Marca: ");
          lab=br.readLine().toUpperCase();
          System.out.print("Cantidad/Stock: ");
          cant_tot=Integer.parseInt(br.readLine());
          System.out.print("Precio: ");
          precio=Double.parseDouble(br.readLine());

        p = new Producto(id, nom_prod, contenido, lab, cant_tot, precio);
        hst.agregarPro(p);
      }

        static void Consultar()throws IOException{
          String N;
          System.out.println("Busqueda de producto por su nombre");
          System.out.println("Ingrese el nombre: ");
          N=br.readLine();

          System.out.println(Producto.Buscar(N));

          System.out.println(p.toString());
        }
      
       static void Eliminar()throws IOException{
          String N2;
          System.out.println("Eliminar producto");
          System.out.println("Ingrese el nombre del producto a eliminar: ");
          N2=br.readLine();

          System.out.println(Inventario.eliminarPro(N2));
        }

       public static void Cerrar() throws IOException {
         System.out.println("Gracias por usar este programa, iniciando autodestrucción en 3...2...1...");
       }
  }
}
