package com.company;

public class Monster {
    // constructor
    public Monster() {
        int healthMPoint;
    }

    // variables membre
    int m_ihealthPoint = 10;
    String m_sname = "monster";

    // getter/setter
    public int getM_ihealthPoint() {
        return m_ihealthPoint;
    }

    public String getM_sname() {
        return m_sname;
    }

    public void setM_ihealthPoint(int healthPoint) {
        m_ihealthPoint = healthPoint;
    }

    public void setM_sname(String name) {
        m_sname = name;
    }
}
