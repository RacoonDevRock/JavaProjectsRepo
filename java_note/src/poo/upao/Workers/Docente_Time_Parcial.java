package poo.Workers;

public class Docente_Time_Parcial extends Docentes{
    private double Salario_h;
    private double Cant_H;
    
  
  public Docente_Time_Parcial(String Nomb_Emp, int DNI, String Nomb_Dprt, double Salario_h, double Cant_H){
    super (Nomb_Emp, DNI, Nomb_Dprt);
     this.Salario_h = Salario_h;
     this.Cant_H = Cant_H;
   }
  
    public double getSalario_h(){
      return Salario_h;
    }
  
    public void setSalario_h(double Salario_h){
      this.Salario_h = Salario_h;
    } 

    public double getCant_H(){
      return Cant_H;
    }
    
    public void setCant_H(double Cant_H){
      this.Cant_H = Cant_H;
    } 
  
    public double calcularSalario() {
      double Sueld_Final;
      Sueld_Final = Salario_h * Cant_H * 4;
      return Sueld_Final;
    }

    public String toString() {
      return "\n Nombre: " + super.getNomb_Emp() + "\n DNI: " + super.getDNI() + "\n Departamento: " + super.getNomb_Dprt() + "\n Pago por hora:" + Salario_h + "\n Horas Trabajadas (Semanal):" + Cant_H;
    }
} 