package com.company;

import ru.ifmo.se.pokemon.*;

class LeafStorm extends SpecialMove {
    public LeafStorm() {
        super(Type.GRASS, 130 , 90);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {pokemon.setMod( Stat.SPECIAL_ATTACK , -2);
    }
    @Override
    protected String describe() {
        return "использует способность LeafStorm";
    }
}
