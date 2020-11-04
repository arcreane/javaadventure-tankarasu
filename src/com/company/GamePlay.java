package com.company;

// todo protéger les données et les accès
// todo réduire le scope des variables si possible
// todo vérifier la cohérence de la langue

import java.util.Scanner;

public class GamePlay {
    static void StartGame() {
        // solution en dur
        welcomeMessage();
        mainMenu();
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

    /**
     * Fonction explicite
     */
    private static void quitGame() {
        System.exit(0);
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

    private static void playGame() {

    }

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

    /**
     * Cette fonction sert de pivot pour accéder à toutes les facettes du jeu, on atterris içi à chaque fin de partie par ex
     */
    private static void mainMenu() {
        System.out.println("Faites un choix et ne soyez pas PEULTRE!");
        for (m_emenu choice : m_emenu.values()) {
            System.out.println((choice.ordinal() + 1) + " - " + choice);
        }

        int menuChoice = m_scmenuScan.nextInt();
        // choix de la difficulté,HS et Quit
        switch (menuChoice) {
            case 1:
                System.out.println("EASY");
                mainMenu();
                break;
            case 2:
                System.out.println("MEDIUM");
                mainMenu();
                break;
            case 3:
                System.out.println("HARD");
                mainMenu();

                break;
            case 4:
                System.out.println("HIGH_SCORE");
                mainMenu();

                break;
            case 5:
                System.out.println("Have a good Day Boy");
                quitGame();

                break;
            default:
                mainMenu();
// todo gestion d'erreur si entrée non int
        }
    }

    // variable membres
    public boolean m_bendGame = false;
    private static Scanner m_scmenuScan = new Scanner(System.in);

    // les différents choix possible dans le menu principale
    enum m_emenu {EASY, MEDIUM, HARD, HIGH_SCORE, QUIT}
}

// au lancement 5 pièces sont créés avec leur monstre
