package Workers;

public class Docente_Time_Completo extends Docentes{
  
    private double Salario_bas;
    
    public Docente_Time_Completo(String Nomb_Emp, int DNI, String Nomb_Dprt, double Salario_bas){
      super(Nomb_Emp, DNI, Nomb_Dprt);
      this.Salario_bas = Salario_bas;
    }
  
    public double getSalario_bas(){
      return Salario_bas;
    }
  
    public void setSalario_bas(double Salario_bas){
      this.Salario_bas = Salario_bas;
    } 
  
    public double calcularSalario(){
      double Sueld_Final;
      Sueld_Final = Salario_bas - (Salario_bas * 0.15);
      return Sueld_Final;
    }

    public String toString(){
      return "\nNombre: "+ super.getNomb_Emp()+ "\nDNI: " + super.getDNI() + "\n Departamento: " + super.getNomb_Dprt() + "\n Sueldo: " + Salario_bas;
    }
}