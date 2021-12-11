package com.company;

import ru.ifmo.se.pokemon.*;

class ShadowBall  extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon op1) {

        double acc = 0.2;
        double rnd = Math.random();
        if (rnd >= acc) {
            op1.setMod(Stat.SPECIAL_ATTACK, 1);
        }


    }
    @Override
    protected String describe() {
        return "использует способность ShadowBall";

    }
}
