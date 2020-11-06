package com.company.place;

import com.company.charactere.Adventurer_new;

public class Dungeon {
    // constructor
    // initialisation du dungeon todo effacer à la fin

    /**
     * dungeon contains a number of room depends difficulty
     *
     * @param difficulty - the difficulty set the number of Rooms, so by the number of Monster to fight
     */
    public Dungeon(int difficulty) {
        m_aDungeonRoom = new Room[(4 + difficulty)];
        // filling dungeon with a number of room
        for (Room oneRoom : m_aDungeonRoom
        ) {
            oneRoom = new Room();
        }
    }

    //méthodes

    // fill each room with monster
    public void fillTheRoom() {
//        for (int i = 0; i < dungeonRoom.length; i++) {
//          dungeonRoom[i] = new Room("Wizard",20,false);
//        }
    }

    /**
     * give the Heroes capability of enter the dungeon
     */
    public void enterDungeon(Adventurer_new player) {
        // todo gestion du heros isAlive() lors de l'entrée dans la Room
        for (Room room : m_aDungeonRoom
        ) {
            room.openDoor(player);
        }
    }

    // variables membres
    // todo effacer à la fin
    // déclaration de l'objet donjon
    Room[] m_aDungeonRoom;
}
