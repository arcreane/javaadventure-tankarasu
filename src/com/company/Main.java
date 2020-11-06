package com.company;

import com.company.place.Dungeon;

public class Main {

    public static void main(String[] args) {

        // GamePlay.StartGame();
        Dungeon myDungeon = new Dungeon(3);
        myDungeon.fillTheRoom();
        myDungeon.enterDungeon();

    }

}
