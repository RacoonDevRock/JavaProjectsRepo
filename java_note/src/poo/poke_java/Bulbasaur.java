package poo.poke_java;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con latigo cepa");
    }

}
