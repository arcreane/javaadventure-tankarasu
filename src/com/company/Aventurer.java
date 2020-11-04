package com.company;

public class Aventurer {

    public Aventurer() {

    }

    //    State
    private static int m_iHealthPoint = 200;
    private static int numberOfFlask = 0;

    /*void openDoor() {
        // l'ouverture de la porte provoque l'attaque du monstre
        System.out.println("La porte s'ouvre");
    }*/

    //    Behavior
    public static void attackWithWaterFlask() {
        System.out.println("Wizard loose 10pt");
        System.out.println("Il y a " + numberOfFlask + " flasques d'eau");
        System.out.println("il vour reste " + m_iHealthPoint + " points de vies");
        numberOfFlask++;
    }

    public static void attackWithSword() {
        System.out.println("Barbarian loose 10pt");
        System.out.println("10% de chance d'assommer l'agresseur");
        System.out.println("il vour reste" + m_iHealthPoint + " points de vies");

    }
}
