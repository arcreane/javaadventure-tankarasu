package com.company.place;

import com.company.charactere.Adventurer_new;
import com.company.charactere.Warrior_new;
import com.company.weapons.Weapon;

public class Room {
    // constructor
    public Room() {
        Warrior_new m_warrior = new Warrior_new();
        m_Weapon = new Weapon();
    }

    // Méthodes

    /**
     * This function initiate the start of the duel
     *
     * @param player - The Player
     */
    public void openDoor(Adventurer_new player) {
        while (player.isAlive() && m_warrior.isAlive()) {
            m_warrior.attack(player);
            // todo essayer de le placer dans l'attaque ou la phase de combat
            if (!m_warrior.isAlive()) {
                break;
            }
            player.attack(m_warrior);
        }
    }

    // variables membres
    Warrior_new m_warrior;
    Weapon m_Weapon;
}
