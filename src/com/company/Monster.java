package com.company;

public class Monster {
    // constructor
    public Monster() {
    }

    //méthodes
    public static void attack() {
        int damage = 10;
        int playerHP = Aventurer.getM_iHealthPoint();

        if (m_sname.equals("Wizard")) {
            if (GamePlay.isRandomEventHappened(10)) {
                System.out.println("you took " + damage + " damage and were paralized for one turn");
                playerHP -= damage;
                Aventurer.setM_iHealthPoint(playerHP);
                System.out.println("You have now " + playerHP + " HP.");
                System.out.println("So Wizard attack again and you took " + damage + " damage");
                playerHP -= damage;
                Aventurer.setM_iHealthPoint(playerHP);
                System.out.println("You have now " + playerHP + " HP.");
            }
            System.out.println("you took " + damage + " damage");
            playerHP -= damage;
            Aventurer.setM_iHealthPoint(playerHP);
            System.out.println("You have now " + playerHP + " HP.");

        } else {
            if (GamePlay.isRandomEventHappened(30)) {
                damage = 30;
                System.out.println("the Barbarian double his attack and you took " + damage + " damage");
            } else {
                damage = 15;
                System.out.println("you took " + damage + " damage");
            }
            playerHP -= damage;
            Aventurer.setM_iHealthPoint(playerHP);
            System.out.println("You have now " + playerHP + " HP.");
        }
    }

    // variables membre
    static int m_ihealthPoint = 10;
    static String m_sname = "monster";
    static String m_sweakness = "";

    // getter
    public static int getM_ihealthPoint() {
        return m_ihealthPoint;
    }

    public static String getM_sname() {
        return m_sname;
    }

    public String getM_sweakness() {
        return m_sweakness;
    }

    //setter
    public static void setM_ihealthPoint(int healthPoint) {
        m_ihealthPoint = healthPoint;
    }

    public void setM_sname(String name) {
        m_sname = name;
    }

    public void setM_sweakness(String weakness) {
        m_sweakness = weakness;
    }
}
// TODO: 06/11/2020 if wizard defeated dont display the number of pool 