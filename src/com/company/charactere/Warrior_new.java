package com.company.charactere;

import com.company.weapons.Weapon;

public class Warrior_new {


    //Constructor
    public Warrior_new() {
        m_ihealthPoint = 20;
//        m_nsame = name;
//        m_ihealthPoint = healthPoint;
//        m_bisKO = isKO;
    }

    // méthodes

    /**
     * Function that make the player loose HP du Monster Attack
     *
     * @param m_idamage - damage done by the weapon of the monster
     */
    public void takeDamage(int m_idamage) {
        setM_ihealthPoint(getM_ihealthPoint() - m_idamage);

        if (getM_ihealthPoint() <= 0) {
            System.out.println("You die!");
        } else {
            System.out.println("You took " + m_idamage + " damage\nYou have " + getM_ihealthPoint() + " HP remaining");
        }
    }

    public void attack(Adventurer_new player) {
        player.takeDamage(m_weapon.getM_idamage());
    }

    public boolean isAlive() {
        return m_ihealthPoint > 0;
    }

    // variable membres
    private String m_nsame;
    private int m_ihealthPoint;
    private boolean m_bisKO;
    Weapon m_weapon;

    // getters

    public int getM_ihealthPoint() {
        return m_ihealthPoint;
    }

//    setters

    public void setM_ihealthPoint(int healthPoint) {
        m_ihealthPoint = healthPoint;
    }
}
