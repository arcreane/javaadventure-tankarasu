package com.company;

public class Barbarian {

    //Constructor
    public Barbarian() {
    }

    //variables membres
    private static int m_iHealthPoint = 20;
    static String m_sname = "Barbarian";
    private static String m_sweakness = "Sword";


    public static String getM_sname() {
        return m_sname;
    }

    public void setM_sname(String m_sname) {
        this.m_sname = m_sname;
    }

    // méthodes d'accès
    //getters
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public static String getM_sweakness() {
        return m_sweakness;
    }

    //setters
    public void setM_iHealthPoint(int m_iHealthPoint) {
        this.m_iHealthPoint = m_iHealthPoint;
    }
}
// todo faire un tour des this et ranger le fichier
// TODO: 05/11/2020 return needed on method?