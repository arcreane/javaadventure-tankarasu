package com.company.charactere;

import com.company.weapons.Axe;

public class Barbarian_new extends Warrior_new {

    // constructor

    public Barbarian_new() {
        super();
        m_ihealthPoint = 30;
        m_sName = "Barbarian";
        m_bIsKO = false;
    }

    // variables membre
    Axe weapon = new Axe();

    public  void attack() {
        System.out.println("The barbarian attack");
    }
}
