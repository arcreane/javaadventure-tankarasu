package com.company;

import com.company.charactere.Adventurer_new;
import com.company.place.Dungeon;

public class Main {

    public static void main(String[] args) {

        // pénétrer le dungeon et entrer dedans
        // finir toutes les pièces
        Adventurer_new player = new Adventurer_new();
        // TODO: 06/11/2020 remplacer la valeur difficulté par une variable dynamique
        Dungeon uglyDungeon = new Dungeon(3);

        uglyDungeon.enterDungeon(player);

    }

}
