package com.company;

import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle B = new Battle();

        Pokemon p1 = new Dhelmise("sartir", 5); // 0
        Pokemon p2 = new Cubchoo("Santiz", 6);// 1
        Pokemon p3 = new Beartic("sanitaizer", 1); // 1

        Pokemon p4 = new Bellsprout("submit", 1);  // 1
        Pokemon p5 = new Weepinbell("salam", 5);  // 28
        Pokemon p6 = new Victreebel("vantuz", 6);  // 33

        B.addAlly(p3);
        B.addAlly(p1);
        B.addAlly(p2);


        B.addFoe(p4);
        B.addFoe(p5);
        B.addFoe(p6);

        B.go();
    }
}

