package com.company.weapons;

public class Axe extends Weapon {

    // constructor
    public Axe() {

    }

    // méthodes
    public static int axeAttack() {
        setM_idamage(15);
        System.out.println("an " + getM_sname() + " deals " + getM_idamage() + " damage per attack!");
        return getM_idamage();
    }

    // variable membre
    private static int m_idamage;
    private static final String m_sname = "Axe";

    // getters
    public static int getM_idamage() {
        return m_idamage;
    }

    public static String getM_sname() {
        return m_sname;
    }

    // setters
    public static void setM_idamage(int damage) {
        m_idamage = damage;
    }
}
