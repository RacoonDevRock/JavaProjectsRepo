package poo.upao.CafeElNegrito;

public class MedMedio extends ComplementosMedida {
    Cafe bebida;

    public MedMedio(Cafe var1) {
        this.bebida = var1;
    }

    public String getDescripcion() {
        return this.bebida.getDescripcion() + ", Tama\u00f1o: Medio(M)";
    }
    
    @Override
    public double costo(int x) {
        return 0.1 + this.bebida.costo(x);
    }
}
