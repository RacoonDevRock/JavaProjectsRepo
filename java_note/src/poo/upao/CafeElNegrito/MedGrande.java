package poo.CafeElNegrito;

public class MedGrande extends ComplementosMedida {

    Cafe bebida;

    public MedGrande(Cafe var1) {
        this.bebida = var1;
    }

    @Override
    public String getDescripcion() {
        return this.bebida.getDescripcion() + ", Tama\u00f1o: Grande(G)";
    }

    @Override
    public double costo(int x) {
        return 0.2 + this.bebida.costo(x);
    }
    
}
