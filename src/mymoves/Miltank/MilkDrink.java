package mymoves.Miltank;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class MilkDrink extends StatusMove {

    public MilkDrink(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        double maxHp = p.getStat(Stat.HP);
        double healAmount = maxHp * 0.5; // восстанавливаем 50% максимального здоровья
        p.setMod(Stat.HP, (int) healAmount);
    }




    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}
