package com.company.charactere;

import com.company.weapons.Weapon;

public class Adventurer_new extends Warrior_new {

    // constructor
    public Adventurer_new() {
       /*     String name, int healthPoint, boolean isKO) {
        super(name, healthPoint, isKO);*/

        m_iHealthPoint = 200;
        m_Sword = new Weapon();
        m_Water_Flask = new Weapon();
    }

    // Méthodes

    /**
     * Function that make the player loose HP du Monster Attack
     *
     * @param m_idamage - damage done by the weapon of the monster
     */
    public void takeDamage(int m_idamage) {
        m_iHealthPoint -= m_idamage;

        if (m_idamage <= 0) {
            System.out.println("You die!");
        } else {
            System.out.println("You took " + m_idamage + " damage\nYou have " + m_iHealthPoint + " HP remaining");
        }
    }

    /**
     * Explicit function that return boolean
     *
     * @return - true if you are still alive
     */
    public boolean isAlive() {
        return m_iHealthPoint > 0;
    }

    public void attack(Warrior_new monster) {
        monster.takeDamage(m_weapon.getM_idamage());
    }

    // variable membre
    Weapon m_Sword;
    Weapon m_Water_Flask;
    int m_iHealthPoint;


}
