package com.company;

import ru.ifmo.se.pokemon.*;

class IcicleCrash extends PhysicalMove {
    public IcicleCrash() {
        super(Type.ICE, 85, 90);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect flinch = new Effect().chance(0.3);
    }
    @Override
    protected String describe() {
        return "использует способность IcicleCrash";
    }
}