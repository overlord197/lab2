package com.company;

import ru.ifmo.se.pokemon.*;

class ThunderWave extends StatusMove {
    public ThunderWave () {
        super(Type.ELECTRIC, 0, 90);

    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        double acc = 0.9;
        double rnd = Math.random();
        if (rnd <= acc){
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Thunder Wave";
    }
}


