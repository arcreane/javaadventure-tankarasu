package com.company;

//todo protéger les données et les accès

public class GamePlay {
    static void StartGame() {
        // solution en dur
        welcomeMessage();
        System.out.println("Menu Principale");
        System.out.println("Vous entrez dans le donjon");
        System.out.println("Vous entrez dans la premiere chambre");
        System.out.println("Le monstre vous attaque");
        System.out.println("Le monstre est mort");
        System.out.println("Vous entrez dans la seconde pièce");
        System.out.println("Le monstre vous attaque");
        System.out.println("Le monstre est mort");
        System.out.println("...");
        System.out.println("Vous avez gagné");
        System.out.println("Menu Principale");
    }

    void GameOver() {
        // explicite
    }

    void isEndGame() {
        // fonction qui va vérifier si la partie est terminée
        //
        // tant que la partie n'est pas terminé , on joue.
        // la partie est terminé si:
        // le joueur n'as plus de point de vie - perdu
        // tous les monstres sont éliminés - gagné
    }

   /* void enterTheDungeon() {
        // lors de l'entrée dans le donjon on instancie les chambres et les monstres
    }*/

    /**
     * Message de bienvenue en tout début de partie.
     */
    private static void welcomeMessage() {
        String line = "Bienvenue au pied du Donjon monstrueux et pleins de monstres.";
        String bars = "";
        for (int i = 0; i < line.length(); i++) {
            bars += "-";
        }
        System.out.println(bars + "\n" + line + "\nMontrez leur de quel bois vous vous chauffez !!!\n" + bars);
    }

    public boolean endGame = false;
}

// au lancement 5 pièces sont créés avec leur monstre
