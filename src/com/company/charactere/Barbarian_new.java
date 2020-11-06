package com.company.charactere;

import com.company.weapons.Axe;

public class Barbarian_new extends Warrior_new {

    // constructor

    public Barbarian_new(String name, int healthPoint,boolean isKO) {
        super();
    }

    // variables membre
    Axe weapon = new Axe();
    boolean m_bisKO = false;

    public static void attack(){
        System.out.println("The barbarian attack");
    }
}
