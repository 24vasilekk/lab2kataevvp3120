package mypokemons;

import mymoves.Igglybuff.Flamethrower;
import mymoves.Miltank.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Jigglypuff extends Pokemon {

    public Jigglypuff(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(115, 45, 20, 45, 25, 20);

        Flamethrower flamethrower = new Flamethrower();
        Facade facade = new Facade();

        super.setMove(flamethrower, facade);
    }
}

