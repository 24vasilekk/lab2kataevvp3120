package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

    // https://pokemondb.net/pokedex/miltank
    // https://pokemondb.net/pokedex/eevee
    // https://pokemondb.net/pokedex/glaceon
    // https://pokemondb.net/pokedex/igglybuff
    // https://pokemondb.net/pokedex/jigglypuff
    // https://pokemondb.net/pokedex/wigglytuff

    public static void main(String[] args) {
        Battle b = new Battle();

        Eevee p1 = new Eevee("Владос", 1);
        Miltank p2 = new Miltank("Чушпан", 1);
        Glaceon p3 = new Glaceon("Юрик", 1);
        Igglybuff p4 = new Igglybuff("Стасик",1);
        Jigglypuff p5 = new Jigglypuff("Захарио", 1);
        Wigglytuff p6 = new Wigglytuff("Фил",1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p4);
        b.addFoe(p2);
        b.addFoe(p6);


        b.go();
    }
}