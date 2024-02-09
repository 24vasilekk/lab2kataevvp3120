package mymoves.Miltank;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rest extends PhysicalMove {

    public Rest(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);


    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = (new Effect()).condition(Status.SLEEP).stat(Stat.HP, +5).attack(0.0).turns((2));
        p.setCondition(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}
