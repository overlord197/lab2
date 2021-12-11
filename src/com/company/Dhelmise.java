package com.company;

import ru.ifmo.se.pokemon.*;

    public class Dhelmise extends Pokemon {
        public Dhelmise (String name, int level){
            super(name, level);
            setStats(70, 131, 100, 86, 90, 40);
            setType(Type.GHOST, Type.GRASS);
            setMove(new ThunderWave(), new PlayNice(), new ShadowBall(), new Confide());
        }


    }
