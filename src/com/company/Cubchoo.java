package com.company;

import ru.ifmo.se.pokemon.*;

public class Cubchoo extends Pokemon {
    public Cubchoo (String name, int level){
        super(name, level);
        setStats(55, 70, 40, 60, 40, 40);
        setType(Type.ICE);
        setMove(new Growl(), new Rest(), new Swagger());
    }

}