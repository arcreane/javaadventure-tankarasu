package com.company;

public class Monster {
    // constructor
    public Monster() {
    }

    //méthodes
    public int attack() {
        int damage = 10;
        if (m_sname.equals("Wizard")) {
            if (GamePlay.isRandomEventHappened(10)) {
                System.out.println("you took " + damage + " damage and were paralized for one turn");
                // todo mettre les infos du player hp
                // todo déduire les points du player ici ou ailleurs ?
                System.out.println("So i attack again and you took " + damage + " damage");
                // todo idem
                return damage;
            } else {
                System.out.println("you took " + damage + " damage");
                // todo mettre les infos du player hp
                // todo déduire les points du player ici ou ailleurs ?
                return damage;
            }
        } else {
            if (GamePlay.isRandomEventHappened(30)) {
                damage = 20;
                System.out.println("the Barbarian double his attack and you took " + damage + " damage");
                // todo mettre les infos du player hp
                // todo déduire les points du player ici ou ailleurs ?
                return damage;
            } else {
                System.out.println("you took " + damage + " damage");
                // todo mettre les infos du player hp
                // todo déduire les points du player ici ou ailleurs ?
                return damage;
            }
        }
    }

    // variables membre
    int m_ihealthPoint = 10;
    String m_sname = "monster";
    String m_sweakness = "";

    // getter
    public int getM_ihealthPoint() {
        return m_ihealthPoint;
    }

    public String getM_sname() {
        return m_sname;
    }

    public String getM_sweakness() {
        return m_sweakness;
    }

    //setter
    public void setM_ihealthPoint(int healthPoint) {
        m_ihealthPoint = healthPoint;
    }

    public void setM_sname(String name) {
        m_sname = name;
    }

    public void setM_sweakness(String weakness) {
        m_sweakness = weakness;
    }
}
