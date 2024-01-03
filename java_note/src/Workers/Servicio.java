package Workers;

public class Servicio extends Trabajador{
    private String Nomb_Area;
    private double Salario_bas;

    public Servicio(String Nomb_Emp, int DNI, String Nomb_Area, double Salario_bas) {
        super(Nomb_Emp, DNI);
        this.Nomb_Area = Nomb_Area;
        this.Salario_bas = Salario_bas;
    }
    
    public String getNomb_Area() {
        return Nomb_Area;
    }

    public void setNomb_Area(String Nomb_Area) {
        this.Nomb_Area = Nomb_Area;
    }
  
    public double getSalario_bas() {
        return Salario_bas;
    }
    
    public void setSalario_base(double Salario_bas) {
        this.Salario_bas = Salario_bas;
    }
    
    public double calcularSalario() {
        return Salario_bas;
    }
    
    public String toString() {
        return "\n Nombre: " + super.getNomb_Emp() + "\n DNI: " + super.getDNI() + "\n Nombre de la area: " + Nomb_Area + "\n Sueldo: " + Salario_bas;
    }
}