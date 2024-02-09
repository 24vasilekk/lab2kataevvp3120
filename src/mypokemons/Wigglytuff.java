package mypokemons;


import mymoves.Igglybuff.Flamethrower;
import mymoves.Miltank.Facade;
import mymoves.Wigglytuff.BodySlam;
import mymoves.Wigglytuff.DazzlingGleam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Wigglytuff extends Pokemon {

    public Wigglytuff(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(140, 70, 45, 85, 50, 45);

        Flamethrower flamethrower = new Flamethrower();
        Facade facade = new Facade();
        BodySlam bodySlam = new BodySlam();
        DazzlingGleam dazzlingGleam = new DazzlingGleam();

        super.setMove(flamethrower, facade, bodySlam, dazzlingGleam);
    }
}