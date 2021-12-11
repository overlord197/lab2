package com.company;

import ru.ifmo.se.pokemon.*;

class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.confuse(pokemon);
        pokemon.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected String describe() {
        return "использует способность Swagger";
    }
}

