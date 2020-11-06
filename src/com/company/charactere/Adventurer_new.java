package com.company.charactere;

import com.company.weapons.Weapon;

public class Adventurer_new extends Warrior_new {

    // constructor
    public Adventurer_new() {
       /*     String name, int healthPoint, boolean isKO) {
        super(name, healthPoint, isKO);*/

        // todo à effacer en fin
        // instanciation des objets armes
        m_Sword = new Weapon();
        m_Water_Flask = new Weapon();
    }

    // variable membre
    // déclaration todo à effacer à la fin
    Weapon m_Sword;
    Weapon m_Water_Flask;
}
