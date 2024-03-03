package poo.poke_java;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected Double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();

}
