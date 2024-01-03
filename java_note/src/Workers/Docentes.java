package Workers;

public abstract class Docentes extends Trabajador{
  
    private String Nomb_Dprt;
  
    public Docentes(String Nomb_Emp, int DNI, String Nomb_Dprt){
      super (Nomb_Emp, DNI);
      this.Nomb_Dprt = Nomb_Dprt;
    }
    
    public String getNomb_Dprt(){
      return Nomb_Dprt;
    }
  
    public void setNomb_Dprt(String Nomb_Dprt){
      this.Nomb_Dprt = Nomb_Dprt;
    }

    public abstract double calcularSalario();

    public String toString() {
      return "\n Nombre: " + super.getNomb_Emp() + "\n DNI: " + super.getDNI() + "\n Nombre del departamento: "+ Nomb_Dprt;
    }
}
  