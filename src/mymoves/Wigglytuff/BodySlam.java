package mymoves.Wigglytuff;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {

    public BodySlam(){
        super(Type.NORMAL,85,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.3).condition(Status.PARALYZE);
        p.addEffect(eff);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
