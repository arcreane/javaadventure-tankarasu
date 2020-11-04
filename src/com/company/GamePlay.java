package com.company;

// todo protéger les données et les accès
// todo réduire le scope des variables si possible
// todo vérifier la cohérence de la langue

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    static void StartGame() {
        // solution en dur
        welcomeMessage();
        mainMenu();
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

    private static void playGame(int level) {
        System.out.println("on commence les choses sérieuses, niveau : " + level);
        System.out.println("on initialise la chambre");
        Random randomNumber = new Random();
        // this random provide 0 or 1
        int generatedNumber = (randomNumber.nextInt(10)) % 2;

        // tant que la partie n'est pas terminé , on joue.
        while (!m_bendGame) {
            int count = 10;
            while (count > 0) {
                generatedNumber = (randomNumber.nextInt(10)) % 2;
                System.out.println(generatedNumber);
                System.out.println("la porte s'ouvre et Bim !");
                System.out.println("Combat");
                System.out.println("endgame?");
                System.out.println("Quit");
                count--;
            }
            if (count == 0) {
                m_bendGame = true;
            }
        }
    }

    /**
     * This function display the current High Score Panel
     */
    private static void viewHighScore() {
        System.out.println("High Score Panel");
        for (int i = 0; i < m_aScore.length; i++) {
            System.out.println(m_aScore[i][1] + " - " + m_aScore[i][0]);
        }
    }

    /**
     * Welcome message at the beginning of the game.
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
            case 2:
            case 3:
                playGame(menuChoice);
                break;
            case 4:
                System.out.println("HIGH_SCORE");
                viewHighScore();
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
    private static boolean m_bendGame = false;
    private static Scanner m_scmenuScan = new Scanner(System.in);
    private static String[][] m_aScore = {{"Jon", "3"}, {"Christel", "2"}, {"Julien", "2"}, {"Melissa", "2"}, {"Billy", "1"}};

    // les différents choix possible dans le menu principale
    enum m_emenu {EASY, MEDIUM, HARD, HIGH_SCORE, QUIT}

    private static int passedRoom = 0;
}

// au lancement 5 pièces sont créés avec leur monstre
