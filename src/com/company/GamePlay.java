package com.company;

public class GamePlay {
    static void StartGame() {
        // solution en dur
        System.out.println("Menu Princioale");
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

    void enterTheDungeon() {
        // lors de l'entrée dans le donjon on instancie les chambres et les monstres
    }

    public boolean endGame = false;
}

// au lancement 5 pièces sont créés avec leur monstre
