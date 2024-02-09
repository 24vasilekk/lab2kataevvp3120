package mypokemons;

import mymoves.Miltank.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Miltank extends Pokemon {

    public Miltank(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(95, 80, 105, 40, 70, 100);

        Rest rest = new Rest(0,0);
        MilkDrink milkDrink = new MilkDrink(0,0);
        Swagger swagger = new Swagger(85);
        Facade facade = new Facade();

        super.setMove(rest, milkDrink, swagger, facade);
    }
}
