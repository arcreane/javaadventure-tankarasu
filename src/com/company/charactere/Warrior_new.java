package com.company.charactere;

import com.company.weapons.Weapon;

public class Warrior_new {


    //Constructor
    public Warrior_new() {
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
        System.out.println("the warrior attack");
    }

    /**
     * Explicit function that return boolean
     *
     * @return - true if you are still alive
     */
    public boolean isAlive() {
        return getM_ihealthPoint() > 0;
    }

    // variable membres
    protected int m_ihealthPoint;
    protected String m_sName;
    protected  boolean m_bIsKO;
    Weapon m_weapon;
//    private boolean m_bisKO;

    // getters

    public int getM_ihealthPoint() {
        return m_ihealthPoint;
    }

//    setters

    public void setM_ihealthPoint(int healthPoint) {
        m_ihealthPoint = healthPoint;
    }
}
