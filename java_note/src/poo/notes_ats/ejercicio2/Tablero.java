package poo.notes_ats.ejercicio2;

public class Tablero {
    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void arriba() {
        y += 1;
        System.out.println("ARRIBA.. ");
    }

    public void abajo() {
        y -= 1;
        System.out.println("ABAJO.. ");
    }

    public void derecha() {
        x += 1;
        System.out.println("DERECHA..");
    }

    public void izquierda() {
        x -= 1;
        System.out.println("IZQUIERDA..");
    }

    public void mostrarUbicacion() {
        System.out.println("POSICION FINAL -> x: "+x+" | y: "+y);
    }
}
