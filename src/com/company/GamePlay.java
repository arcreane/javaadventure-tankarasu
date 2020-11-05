package com.company;

// todo protéger les données et les accès
// todo réduire le scope des variables si possible
// todo vérifier la cohérence de la langue

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    static void StartGame() {
        welcomeMessage();
        mainMenu();
        System.out.println("Main Menu");
    }

    /**
     * Fonction explicite
     */
    private static void quitGame() {
        System.exit(0);
    }

    private static void playGame(int level) {
        // on génère l'aventurier
        Aventurer zelda = new Aventurer();
        System.out.println("on commence les choses sérieuses, niveau : " + level);
        Random randomNumber = new Random();
        // this random provide 0 or 1
        int generatedNumber = (randomNumber.nextInt(10)) % 2;
        String generatedMonster = "";

        // tant que la partie n'est pas terminé , on joue.
        while (!m_bendGame) {
            // un monstre est généré
            generatedNumber = (randomNumber.nextInt(10)) % 2;
            Monster myMonster = new Monster();
            generateMonster(generatedNumber, myMonster);

            // la porte s'ouvre et je me fait attaquer
            System.out.println("The doors N°" + (passedRoom + 1) + " is opening and a " + myMonster.getM_sname() + " attacks!");
            while (passedRoom != 5) {
                // no need to fight if your dead
                if (!isAlive(Aventurer.getM_iHealthPoint())) return;

                // monster attack as Welcome message
                Monster.attack();

                // on informe sur l'arme à utiliser
                System.out.println("Monster weaknes is " + myMonster.getM_sweakness());

                // je choisi l'arme à utiliser
                System.out.println("attack with Sword or Water_Flask ?");
                String choosenWeapon = m_scmenuScan.next();
                // todo insert isRandomEventHappen
                // todo verifier que le lowerCase et le trim fonctionne

                // est ce que l'arme est efficace ?
                if (choosenWeapon.equals(myMonster.getM_sweakness())) {
                    System.out.println("The weapon is useFul");
                    Aventurer.attack(myMonster.getM_sname(), myMonster.getM_sweakness(), choosenWeapon);
                    // est ce que le monstre est mort ?
                    if (isAlive(Monster.getM_ihealthPoint())) {
                        System.out.println("the fight continue");
                    } else {
                        System.out.println("the monster is defeated -line 82");
                        passedRoom++;
                        // si tous les monstres sont tués = victoire
                        if (passedRoom == 5) {
                            System.out.println("Vous avez gagné");
                            m_bendGame = true;
                        }
                        // si monstre tué mais qu'il en reste encore on génère un autre monstre
                        generatedNumber = (randomNumber.nextInt(10)) % 2;

                        generateMonster(generatedNumber, myMonster);
                        myMonster.setM_ihealthPoint(20);
                        ;
                    }
                } else {
                    System.out.println("The weapon isn't useful");
                }
            }
        }
    }

    private static void generateMonster(int generatedNumber, Monster myMonster) {
        if (generatedNumber == 0) {
            myMonster.setM_ihealthPoint(Wizard.getM_iHealthPoint());
            myMonster.setM_sname(Wizard.getM_sname());
            myMonster.setM_sweakness(Wizard.getM_sweakness());
        } else {
            myMonster.setM_ihealthPoint(Barbarian.getM_iHealthPoint());
            myMonster.setM_sname(Barbarian.getM_sname());
            myMonster.setM_sweakness(Barbarian.getM_sweakness());

        }
    }

    private static boolean isAlive(int healthPoint) {
        if (healthPoint > 0) return true;
        else return false;
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

// TODO: 05/11/2020 return needed on method?
// todo initialiser les waterFlasks
