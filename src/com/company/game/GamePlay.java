package com.company.game;

// todo protéger les données et les accès

import com.company.charactere.*;
import com.company.place.Dungeon;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    static void StartGame() {
        welcomeMessage();
        mainMenu();
        System.out.println("Main Menu");
    }

    /**
     * the function is explicit
     */
    private static void quitGame() {
        System.exit(0);
    }

    private static void playGame(int level) {
        // adventurer & Dungeon generation
        Adventurer_new player = new Adventurer_new();
        Dungeon uglyDungeon = new Dungeon(level);
        uglyDungeon.enterDungeon(player);




        // tant que la partie n'est pas terminé , on joue.
        while (!m_bendGame) {
            // un monstre est généré
            Monster myMonster = new Monster();

            // la porte s'ouvre et je me fait attaquer
            System.out.println("The doors N°" + (passedRoom + 1) + " is opening and a " + myMonster.getM_sname() + " attacks!");
            while (passedRoom != 5) {
                // no need to fight if your dead
                //if (!isAlive(Aventurer.getM_iHealthPoint())) return;

                // monster attack as Welcome message
                Monster.attack();

                // on informe sur l'arme à utiliser
                System.out.println("Monster weaknes is " + myMonster.getM_sweakness());

                // je choisi l'arme à utiliser
                System.out.println("attack with Sword or Water_Flask ?");
                String choosenWeapon = m_scmenuScan.next();
                // todo insert isRandomEventHappen

                // est ce que l'arme est efficace ?
                if (choosenWeapon.equals(myMonster.getM_sweakness())) {
                    System.out.println("The weapon is useFul");
                    Aventurer.attack(myMonster.getM_sname(), myMonster.getM_sweakness(), choosenWeapon);
                    // est ce que le monstre est mort ?
                    if (true) {
                        System.out.println("the fight continue");
                    } else {
                        System.out.println("the monster is defeated");
                        passedRoom++;
                        // si tous les monstres sont tués = victoire
                        if (passedRoom == 5) {
                            System.out.println("Player have won the treasure");
                            m_bendGame = true;
                        }
                        // si monstre tué mais qu'il en reste encore on génère un autre monstre


                    }
                } else {
                    System.out.println("The weapon isn't useful");
                }
            }
        }
    }

    private static void generateMonster(int generatedNumber, Monster myMonster) {


    }

    public static boolean isRandomEventHappened(int pCentChance) {
        Random randomNumber = new Random();
        int chance = randomNumber.nextInt(100);
        if (pCentChance >= chance) {
            System.out.println("Random event has happened");
            return true;
        }
        return false;
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
    public static void welcomeMessage() {
        String line = "Welcome to the aweful and ugly DUNGEON";
        String bars = "";
        for (int i = 0; i < line.length(); i++) {
            bars += "-";
        }
        System.out.println(bars + "\n" + line + "\nClean it!\n" + bars);
    }

    /**
     * With this function you can access to all the part of the program
     */
    public static void mainMenu() {
        System.out.println("Make a choice and don't be Afraid!!!");
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
    private static final Scanner m_scmenuScan = new Scanner(System.in);
    private static String[][] m_aScore = {{"Jon", "3"}, {"Christel", "2"}, {"Julien", "2"}, {"Melissa", "2"}, {"Billy", "1"}};

    // les différents choix possible dans le menu principale
    enum m_emenu {EASY, MEDIUM, HARD, HIGH_SCORE, QUIT}

    private static int passedRoom = 0;
}

// todo initialiser les waterFlasks
