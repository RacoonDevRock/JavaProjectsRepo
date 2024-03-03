package poo.poke_java;

public class Main {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        // Squirtle
        System.out.println("\nPokemon: Squirtle");
        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();
        squirtle.atacarHidroAplauso();
        squirtle.atacarHidrobomba();
        squirtle.atacarMordisco();
        squirtle.atacarPistolAgua();
        squirtle.atacarPlacaje();

        // Charmander
        System.out.println("\nPokemon: Charmander");
        charmander.atacarAraniazo();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
        charmander.atacarMordisco();
        charmander.atacarPlacaje();
        charmander.atacarPuniofuego();

        // Bulbasaur
        System.out.println("\nPokemon: Bulbasaur");
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarPlacaje();

        // Pikachu
        System.out.println("\nPokemon: Pikachu");
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        pikachu.atacarMordisco();
        pikachu.atacarPlacaje();
        pikachu.atacarPuniotrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();

    }
}
