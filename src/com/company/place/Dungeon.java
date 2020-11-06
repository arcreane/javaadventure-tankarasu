package com.company.place;

public class Dungeon {

    // dungeon contains a number of room depends difficulty
    // constructor
    // initialisation du dungeon todo effacer à la fin
    public Dungeon(int difficulty) {
          m_aDungeonRoom = new Room[(4 + difficulty)];
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
    public void enterDungeon() {
        for (Room aRoom : m_aDungeonRoom) {
            System.out.println("a room in the Dungeon");
        }
    }

    // variables membres
    // todo effacer à la fin
    // déclaration de l'objet donjon
    Room[] m_aDungeonRoom;
}
