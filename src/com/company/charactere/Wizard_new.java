package com.company.charactere;

import com.company.weapons.Lightning;

public class Wizard_new extends Warrior_new {

    // constructor
    public Wizard_new() {
        super();
        m_ihealthPoint = 20;
        m_sName = "Wizard";
        m_bIsKO = false;
    }

    // variables membre
    Lightning weapon = new Lightning();

    public void attack() {
        System.out.println("The Wizard attack");
    }
}
