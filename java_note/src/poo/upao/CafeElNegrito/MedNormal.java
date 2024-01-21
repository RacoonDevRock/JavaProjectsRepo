package poo.upao.CafeElNegrito;

public class MedNormal extends ComplementosMedida {
    Cafe bebida;

    public MedNormal(Cafe var1) {
        this.bebida = var1;
    }

    public String getDescripcion() {
        return this.bebida.getDescripcion() + ", Tama\u00f1o: Normal(N)";
    }

    @Override
    public double costo(int x) {
        return this.bebida.costo(x);
    }
}
