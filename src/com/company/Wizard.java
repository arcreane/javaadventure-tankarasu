package com.company;

public class Wizard {
    // Constructor
    public Wizard() {
        int healthPoint = m_iHealthPoint;
    }

    // Champs/variable d'instances
    private static int m_iHealthPoint = 20;
    public static String m_sname = "Wizard";


    private static String m_sweakness = "Water_Flask";


    // Méthodes d'accès - setter
    public void setM_iHealthPoint(int m_iHealthPoint) {
        this.m_iHealthPoint = m_iHealthPoint;
    }

    public void setM_sname(String m_sname) {
        this.m_sname = m_sname;
    }

    public void setM_sweakness(String m_sweakness) {
        this.m_sweakness = m_sweakness;
    }

    // Méthodes d'accès - getter
    public static int getM_iHealthPoint() {
        return m_iHealthPoint;
    }

    public static String getM_sname() {
        return m_sname;
    }

    public static String getM_sweakness() {
        return m_sweakness;
    }


}
/* todo vérifier les this */
// TODO: 05/11/2020 return needed on method?