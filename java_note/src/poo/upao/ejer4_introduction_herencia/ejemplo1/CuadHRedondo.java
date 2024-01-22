package poo.upao.ejer4_introduction_herencia.ejemplo1;

public class CuadHRedondo extends Figura {
    private Rectangulo rec;
    private Circulo cir;
    
    public CuadHRedondo(int x, int y, Rectangulo rec, Circulo cir) {
        super(x, y);
        this.rec = rec;
        this.cir = cir;
    }

    public Rectangulo getRec() {
        return rec;
    }

    public void setRec(Rectangulo rec) {
        this.rec = rec;
    }

    public Circulo getCir() {
        return cir;
    }

    public void setCir(Circulo cir) {
        this.cir = cir;
    }

    public double calcularArea() {
        return cir.calcularArea() - rec.calcularArea();
    }

    public double calcularPerimetro() {
        return cir.calcularPerimetro() + rec.calcularPerimetro();
    }

    @Override
    public String toString() {
        return "CuadHRedondo -> "+calcularArea()+calcularPerimetro();
    }
}
