package com.company.charactere;

import com.company.weapons.Weapon;

public class Adventurer_new extends Warrior_new {

    // constructor
    public Adventurer_new() {
        super();

        m_Sword = new Weapon();
        m_Water_Flask = new Weapon();
        m_ihealthPoint = 200;
    }

    // Méthodes

    /**
     * Function that make the player loose HP du Monster Attack
     *
     * @param m_idamage - damage done by the weapon of the monster
     */
    public void takeDamage(int m_idamage) {
        setM_ihealthPoint(getM_ihealthPoint() - m_idamage);
        if (m_idamage <= 0) {
            System.out.println("You die!");
        } else {
            System.out.println("You took " + m_idamage + " damage\nYou have " + getM_ihealthPoint() + " HP remaining");
        }
    }


    public void attack(Warrior_new monster) {
        monster.takeDamage(m_weapon.getM_idamage());
    }

    // variable membre
    Weapon m_Sword;
    Weapon m_Water_Flask;


}
