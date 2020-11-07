package com.company.place;

import com.company.charactere.*;

import java.util.Random;

public class Room {
    // constructor
    public Room() {
        Warrior_new m_warrior = new Warrior_new();

        // generate Monster when creating the room

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
            // TODO: 06/11/2020 gerer les randoms Events et les performAttack 
            if (!m_warrior.isAlive()) {
                break;
            }

            player.attack(m_warrior);

        }
    }

    // variables membres
    Warrior_new m_warrior;
    Random randomNumber;
    int generatedNumber;
}
