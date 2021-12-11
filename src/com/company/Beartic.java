package com.company;

import ru.ifmo.se.pokemon.*;

public class Beartic extends Pokemon {
    public Beartic (String name, int level){
        super(name, level);
        setStats(95, 130, 80, 70, 80, 50);
        setType(Type.ICE);
        setMove(new Growl(), new Rest(), new Swagger(), new IcicleCrash());
    }


}