package com.company;

public class Wizard {
    // Constructor
    public Wizard() {
        int healthPoint = m_iHealthPoint;
    }

    // Champs/variable d'instances
    private static int m_iHealthPoint = 20;
    public static String m_sname = "Wizard";
    private String m_sweakness = "Water Flask";


    // Méthodes d'accès - setter
    public void setM_iHealthPoint(int m_iHealthPoint) {
        this.m_iHealthPoint = m_iHealthPoint;
    }

    public void setM_sname(String m_sname) {
        this.m_sname = m_sname;
    }

    // Méthodes d'accès - getter
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public static String getM_sname() {
        return m_sname;
    }

}
/* todo vérifier les this */