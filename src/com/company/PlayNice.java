package com.company;

import ru.ifmo.se.pokemon.*;

class PlayNice extends StatusMove {
    public PlayNice() {
        super(Type.NORMAL, 0, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Play Nice";
    }
}