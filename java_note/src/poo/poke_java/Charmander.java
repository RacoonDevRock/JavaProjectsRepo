package poo.poke_java;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y estoy atacando con mordisco");
    }

    @Override
    public void atacarPuniofuego() {
        System.out.println("Hola soy Charmander y estoy atacando con puño de fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y estoy atacando con lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y estoy atacando con ascuas");
    }
    
}
