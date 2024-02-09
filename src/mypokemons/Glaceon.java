package mypokemons;


import mymoves.Eevee.Bite;
import mymoves.Eevee.Tackle;
import mymoves.Eevee.WorkUp;
import mymoves.Glaceon.FrostBreath;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glaceon extends Pokemon {

    public Glaceon(String name, int level) {
        super(name, level);

        super.setType(Type.ICE);
        super.setStats(65, 60, 110, 130, 95, 65);

        WorkUp workUp = new WorkUp();
        Tackle tackle = new Tackle();
        Bite bite = new Bite(60, 100);
        FrostBreath frostBreath = new FrostBreath();

        super.setMove(workUp, tackle, bite, frostBreath);
    }

}
