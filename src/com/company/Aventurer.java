package com.company;

public class Aventurer {

    public Aventurer(String name, int age) {
        this.m_sName = name;
        this.m_iAge = age;

        System.out.println(this.m_sName + " - " + this.m_iAge);
    }

    private String m_sName;
    private int m_iAge;
    private int m_iHealthPoint = 200;

    void openDoor() {
        // l'ouverture de la porte provoque l'attaque du monstre
        System.out.println("La porte s'ouvre");
    }
}
