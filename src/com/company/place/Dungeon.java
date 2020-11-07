package com.company.place;

import com.company.charactere.Adventurer_new;
import com.company.charactere.Barbarian_new;
import com.company.charactere.Warrior_new;
import com.company.charactere.Wizard_new;

import java.util.Random;

public class Dungeon {
    // constructor
    // initialisation du dungeon todo effacer à la fin

    /**
     * dungeon contains a number of room depends difficulty
     */
    public Dungeon(int level) {
        m_numberOfRoom = 4 + level;
    }

    //méthodes

    /**
     * give the Heroes capability of enter the dungeon
     */
    public void enterDungeon(Adventurer_new player) {
        System.out.println("Serious things start at difficulty level: " + (m_numberOfRoom - 4));
        // while the player is Alive the game continue
        while (player.isAlive()) {
            // we'll loop through each room
            Warrior_new monster;
            while (m_numberOfRoom > 0) {
                // when entering in a Room , a monster is generated
                System.out.println("Chambre n°" + m_numberOfRoom);
                generateMonster();
                // the fight can start
                while (player.isAlive() ) {
                    monster.attack(player);
                }
                m_numberOfRoom--;
            }

        }
    }

    public void generateMonster() {
        Random randomNumber = new Random();
        int generatedNumber = (randomNumber.nextInt(10)) % 2;
        if (generatedNumber == 0) {
           monster = new Wizard_new();
        } else {
            monster = new Barbarian_new();
        }
    }

    //    Setters


    // variables membres
    int m_numberOfRoom;

}
