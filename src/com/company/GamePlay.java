package com.company;

// todo protéger les données et les accès
// todo réduire le scope des variables si possible
// todo vérifier la cohérence de la langue

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
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            myMonster.attack();//test
            // la porte s'ouvre et je me fait attaquer
            System.out.println("The doors is opening and a " + myMonster.getM_sname() + " attacks!");
            // suis-je encore en vie
            while (passedRoom != 5) {
                if (areYouAlive()) return;
                // l'évènement aléatoire a t-il eu lieu?
                isRandomEventHappened(50);
                System.out.println("You take 10 damage and your healthPoint are now 190 pt -line 62");

                // on informe sur l'arme à utiliser
                String wichWeaponsToUse = determinateTheGoodWeapon(generatedMonster);
                System.out.println("You must use " + wichWeaponsToUse + " against " + generatedMonster + "!!! -line 66");

                // je choisi l'arme à utiliser
                System.out.println("Wich weapon would you use? -line 70");
                String choosenWeapon = m_scmenuScan.next();
                // todo insert isRandomEventHappen
                // todo verifier que le lowerCase et le trim fonctionne
                choosenWeapon.toLowerCase();
                choosenWeapon.trim();
                // est ce que l'arme est efficace ?
                if (isWeaponUseful(generatedMonster, choosenWeapon)) {
                    System.out.println("The weapon is useFul -line 76");
                    // est ce que le monstre est mort ?
                    System.out.println("is Monster still Alive? (y/n) -line 78");
                    if (!isAlive()) {
                        System.out.println("the fight continue -line 80");
                        // si le monstre est encore vivant , on déduit les effets de l'attaque de ses points de vies et on vérifie si l'évènement aléatoire a eut lieu
                    } else {
                        System.out.println("the monster is defeated -line 82");
                        passedRoom++;
                        // si tous les monstres sont tués = victoire
                        if (passedRoom == 5) {
                            System.out.println("Vous avez gagné");
                            m_bendGame = true;
                        }
                        // si monstre tué mais qu'il en reste encore on génère un autre monstre
                    }
                } else {
                    System.out.println("The weapon isn't useful -line 86");
                }
            }
        }
    }

    private static void generateMonster(int generatedNumber, Monster myMonster) {
        if (generatedNumber == 0) {
            myMonster.setM_ihealthPoint(Wizard.getM_iHealthPoint());
            myMonster.setM_sname(Wizard.getM_sname());
        } else {
            myMonster.setM_ihealthPoint(Barbarian.getM_iHealthPoint());
            myMonster.setM_sname(Barbarian.getM_sname());
        }
    }

    private static boolean isAlive() {
        String isAlive = m_scmenuScan.next();
        if (isAlive.equals("n")) {
            return true;
        }
        return false;
    }

    private static boolean isWeaponUseful(String generatedMonster, String choosenWeapon) {
        if ((choosenWeapon.equals("sword") & generatedMonster.equals("Barbarian")) | (choosenWeapon.equals("water flask") & generatedMonster.equals("Wizard"))) {
            System.out.println("The " + generatedMonster + " takes damage -line 104");
            return true;
        } else {
            System.out.println("You didn't damaged the " + generatedMonster + " -line 114");
            return false;
        }
    }

    private static String determinateTheGoodWeapon(String generatedMonster) {
        String wichWeaponsToUse;
        if (generatedMonster.equals("Wizard")) {
            wichWeaponsToUse = "Water Flask";
        } else {
            wichWeaponsToUse = "Sword";
        }
        return wichWeaponsToUse;
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

    private static boolean areYouAlive() {
        System.out.println("Are you still Alive? (y/n) -line 133");
        if (isAlive()) return true;
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
    // todo verifier si le scanner en final ne pose pas de problème
    private static final Scanner m_scmenuScan = new Scanner(System.in);
    private static String[][] m_aScore = {{"Jon", "3"}, {"Christel", "2"}, {"Julien", "2"}, {"Melissa", "2"}, {"Billy", "1"}};

    // les différents choix possible dans le menu principale
    enum m_emenu {EASY, MEDIUM, HARD, HIGH_SCORE, QUIT}

    private static int passedRoom = 0;
}

