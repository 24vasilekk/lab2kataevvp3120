package mymoves.Igglybuff;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {

    public Flamethrower() {

        super(Type.FIRE, 90, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect eff = new Effect().chance(0.1).condition(Status.BURN).turns(-1);
        eff.stat(Stat.ATTACK, -2).stat(Stat.HP, (int)p.getStat(Stat.HP) / 16);
        p.setCondition(eff);

    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}