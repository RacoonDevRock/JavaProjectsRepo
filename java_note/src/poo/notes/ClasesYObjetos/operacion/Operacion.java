package poo.notes.ClasesYObjetos.operacion;

public class Operacion {

    // atributos
    int numero1;
    int numero2;

    // metodos

    // Metodo para pedir que nos digite 2 numeros
    
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multi(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int div(int numero1, int numero2) {
        return numero1 / numero2;
    }

    // public void mostrarResultados() {
    //     System.out.println("Suma "+sumar(numero1, numero2));
    //     System.out.println("Resta "+resta(numero1, numero2));
    //     System.out.println("Multi "+multi(numero1, numero2));
    //     System.out.println("Div "+div(numero1, numero2));
    // }
}
