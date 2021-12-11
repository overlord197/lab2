package com.company;

import ru.ifmo.se.pokemon.*;

public class Weepinbell extends Bellsprout {
    public Weepinbell (String name, int level){
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new VineWhip(), new StunSpore());
    }


}