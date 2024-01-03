package Workers;

public class Pruebita{
  public static void main(String[] args){

  Trabajador worker;


  Administrativo a1 = new Administrativo("Paquito", 65345678, "Oficina de Gestión Empresarial", "Supervisor", 3200);
  worker = a1;
  System.out.println("\nDATOS DEL TRABAJADOR (Administrativo):" + a1.toString());
  System.out.println("*************************************");
  System.out.println(" Salario: "+ a1.calcularSalario());
  System.out.println("*************************************");

 

  Servicio s1 = new Servicio("Pepo", 87654841, "Limpieza y mantenimiento de equipos", 200);
  worker = s1;
  System.out.println("\nDATOS DEL TRABAJADOR(Servicio) :" + s1.toString());
  System.out.println("*************************************");
  System.out.println(" Salario:" + s1.calcularSalario());
  System.out.println("*************************************");

 

  Docente_Time_Completo d1 = new Docente_Time_Completo("Marce", 85246587, "Física", 650);
  worker = d1;
  System.out.println("\nDATOS DEL TRABAJADOR(Docente) :" + d1.toString());
  System.out.println("*************************************");
  System.out.println(" Salario: "+ d1.calcularSalario());
  System.out.println("*************************************");



  Docente_Time_Parcial d2 = new Docente_Time_Parcial("Edward", 46558278, "Programación", 250, 2);
  worker = d2;
  System.out.println("\nDATOS DEL TRABAJADOR(Docente) :" + d2.toString());
  System.out.println("*************************************");
  System.out.println(" Salario:" + d2.calcularSalario());
  System.out.println("*************************************");

  }
}