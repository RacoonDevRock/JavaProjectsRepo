package poo.Workers;

public abstract class  Trabajador {
  private String Nomb_Emp;
  private int DNI;
  
  public Trabajador(String Nomb_Emp, int DNI){
    this.Nomb_Emp = Nomb_Emp;
    this.DNI = DNI;
  }
  
  public String getNomb_Emp() {
    return Nomb_Emp;
  }

  public void setNomb_Emp(String Nomb_Emp) {
    this.Nomb_Emp = Nomb_Emp;
  }

  public int getDNI() {
    return DNI;
  }

  public void setDNI(int DNI) {
    this.DNI = DNI;
  }
  
  public abstract double calcularSalario();
}