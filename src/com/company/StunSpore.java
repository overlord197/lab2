package com.company;

import ru.ifmo.se.pokemon.*;

class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0, 75);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect paralyze = new Effect().chance(0.75);
    }
    @Override
    protected String describe() {
        return "использует способность StunSpore";
    }
}

