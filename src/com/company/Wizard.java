package com.company;

public class Wizard {
    // Constructor
    public Wizard() {
    }

    // Champs/variable d'instances
    private static int m_iHealthPoint = 20;
    public static String m_sname = "Wizard";
    private static String m_sweakness = "Water_Flask";

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
