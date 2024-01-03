package Workers;

public class Administrativo extends Trabajador{
    private String Nomb_Off;
    private String Cargo;
    private double Prim_pago;
  
    public Administrativo(String Nombre, int DNI, String Nomb_Off, String Cargo, double Prim_pago){
      super(Nombre, DNI); 
      this.Nomb_Off = Nomb_Off;
      this.Cargo = Cargo;
      this.Prim_pago = Prim_pago;
    }
     public String getNomb_Off(){
      return Nomb_Off;
    }
  
    public void setNomb_Off(String Nomb_Off){
      this.Nomb_Off = Nomb_Off;
    }
  
    public String getCargo(){
      return Cargo;
    }
  
    public void setCargo(String Cargo){
      this.Cargo = Cargo;
    }
  
    public double getPrim_pago(){
      return Prim_pago;
    }
  
    public void setPrim_pago(double Prim_pago){
      this.Prim_pago = Prim_pago;
    }
  
    public double calcularSalario(){
      double Sueld_Final;
      Sueld_Final = Prim_pago - (Prim_pago * 0.12);
      return Sueld_Final;
    }
  
    public String toString(){
      return "\n Nombre: " +super.getNomb_Emp()+ "\n DNI: " +super.getDNI()+ "\n Nombre de la oficina: " + Nomb_Off+ "\n Cargo: " + Cargo + "\n Sueldo: " + Prim_pago;
  }
}