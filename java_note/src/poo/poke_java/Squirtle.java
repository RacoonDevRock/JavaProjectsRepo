package poo.poke_java;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y estoy atacando con hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y estoy atacando con burbuja");
    }

    @Override
    public void atacarPistolAgua() {
        System.out.println("Hola soy Squirtle y estoy atacando con pistola de agua");
    }

    @Override
    public void atacarHidroAplauso() {
        System.out.println("Hola soy Squirtle y estoy atacando con hidro aplauso");
    }

}