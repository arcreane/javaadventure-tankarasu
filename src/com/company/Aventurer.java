package com.company;

public class Aventurer {

    //constructor
    public Aventurer() {

    }

    //    State/Champs
    private static int m_iHealthPoint = 200;

    private static int numberOfFlask = 0;
    private static String m_sname = "Zelda";
    private static int damage = 10;
    private static String choosenWeapon = "";

    //    Behavior/ Methods
    private static int attack(String nameMonster, String weakness, String choosenWeapon) {
        if (nameMonster.equals("Wizard") & choosenWeapon.equals(weakness)) {
            setNumberOfFlask(getNumberOfFlask() + 1);
            damage += (numberOfFlask - 1) * 2;
            return damage;
        } else if (nameMonster.equals("Barbarian") & choosenWeapon.equals(weakness)) {
            return damage;
        } else {
            return 0;
        }
    }

    private static void resetFlaskNumber() {
        // set number Flask
    }

    private static void attackWithWaterFlask() {
        System.out.println("Wizard loose 10 pt");
        System.out.println("Il y a " + numberOfFlask + " flasques d'eau");
        System.out.println("il vour reste " + m_iHealthPoint + " points de vies");
        numberOfFlask++;
    }

    private static void attackWithSword() {
        System.out.println("Barbarian loose 10 pt");
        System.out.println("10% de chance d'assommer l'agresseur");
        System.out.println("il vour reste" + m_iHealthPoint + " points de vies");

    }

    // Méthodes d'accès
    // getters
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public static String getChoosenWeapon() {
        return choosenWeapon;
    }

    public static int getDamage() {
        return damage;
    }

    public static int getNumberOfFlask() {
        return numberOfFlask;
    }

    public static String getM_sname() {
        return m_sname;
    }

    //setters
    public static void setM_iHealthPoint(int m_iHealthPoint) {
        Aventurer.m_iHealthPoint = m_iHealthPoint;
    }

    public static void setNumberOfFlask(int numberOfFlask) {
        Aventurer.numberOfFlask = numberOfFlask;
    }

    public static void setM_sname(String m_sname) {
        Aventurer.m_sname = m_sname;
    }

    public static void setDamage(int damage) {
        Aventurer.damage = damage;
    }

    public static void setChoosenWeapon(String choosenWeapon) {
        Aventurer.choosenWeapon = choosenWeapon;
    }


}
