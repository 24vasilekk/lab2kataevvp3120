package mypokemons;

import mymoves.Eevee.Bite;
import mymoves.Eevee.Tackle;
import mymoves.Eevee.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Eevee extends Pokemon {

    public Eevee(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(55, 55, 50, 45, 65, 55);

        WorkUp workUp = new WorkUp();
        Tackle tackle = new Tackle();
        Bite bite = new Bite(60,100);


        super.setMove(workUp, tackle, bite);
    }
}
