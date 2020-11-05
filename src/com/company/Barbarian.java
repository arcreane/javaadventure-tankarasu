package com.company;

public class Barbarian {

    //Constructor
    public Barbarian() {
    }

    //variables membres
    private static int m_iHealthPoint = 20;
    static String m_sname = "Barbarian";
    private static String m_sweakness = "Sword";


    // méthodes d'accès
    //getters
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public static String getM_sweakness() {
        return m_sweakness;
    }

    public static String getM_sname() {
        return m_sname;
    }
}
