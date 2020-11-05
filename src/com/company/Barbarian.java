package com.company;

public class Barbarian {

    //Constructor
    public Barbarian() {
    }

    //variables membres
    private static int m_iHealthPoint = 20;
    static String m_sname = "Barbarian";
    private String m_sweakness = "";


    public static String getM_sname() {
        return m_sname;
    }

    public void setM_sname(String m_sname) {
        this.m_sname = m_sname;
    }

    // méthodes d'accès
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public void setM_iHealthPoint(int m_iHealthPoint) {
        this.m_iHealthPoint = m_iHealthPoint;
    }

    // méthodes
    public void attack() {
        System.out.println("Take this AXE");
    }
    // attack with BarbarianAxe

}
// todo faire un tour des this et ranger le fichier