package com.company.charactere;

import com.company.charactere.Warrior_new;
import com.company.weapons.Axe;

public class Wizard_new extends Warrior_new {

    // constructor
    public Wizard_new(String name, int healthPoint, boolean isKO) {
        super();
    }

    // variables membre
    Axe weapon = new Axe();

    public static void attack() {
        System.out.println("The Wizard attack");
    }
}
