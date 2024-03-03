package poo.poke_java;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y estoy atacando con mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y estoy atacando con impact trueno");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola soy Pikachu y estoy atacando con puño de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y estoy atacando con rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y estoy atacando con rayo carga");
    }
    
}