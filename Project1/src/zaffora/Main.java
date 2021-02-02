package zaffora;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String v = "Varsity",
                jv = "Junior Varsity",
                vo = "Varsity Opponent",
                jvo = "Junior Varsity Opponent";
        int choice = 0, team = 0;

        // Creating the team objects
        Team varsity = new Team();
        Team jvarsity = new Team();
        Team vOpp = new Team();
        Team jvOpp = new Team();

        //assigning the names for all the teams
        varsity.setName(v);
        jvarsity.setName(jv);
        vOpp.setName(vo);
        jvOpp.setName(jvo);

        // Initializing the arrays with random values
        varsity.random();
        jvarsity.random();
        vOpp.random();
        jvOpp.random();

        // Print all the scores for all the quarter for each game for each team
        /*
        for (int game = 0; game < 10; game++) {
            System.out.println("Game " + game+1 + ":");
            varsity.printQrt(game);

            System.out.println("\n");
            jvarsity.printQrt(game);
        }1

        */


        // Make Menu
        /*
        #### MENU ####
1: View average points scored by quarter.
2: View average points scored by half.
3: View average points scored by game.
4: View average point difference by quarter.
5: View average point difference by half.
6: View average point difference by game.
7: View highest points scored.
8: View lowest points scored.
9: Exit.
What would you like to do? (1-9):
         */
        do {
            System.out.println("        #### MENU ####\n" +
                    "1: View average points scored by quarter.\n" +
                    "2: View average points scored by half.\n" +
                    "3: View average points scored by game.\n" +
                    "4: View average point difference by quarter.\n" +
                    "5: View average point difference by half.\n" +
                    "6: View average point difference by game.\n" +
                    "7: View highest points scored.\n" +
                    "8: View lowest points scored.\n" +
                    "9: Exit.\n" +
                    "What would you like to do? (1-9):");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average points scored per quarter for varsity is:\n");
                        varsity.averageQtr();
                    }
                    else if (team == 2) {
                        System.out.println("The average points scored per quarter for junior varsity is:\n");
                        jvarsity.averageQtr();
                    }
                    break;
                case 2:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average points scored per half for varsity is:");
                        varsity.averageHalf();
                    }
                    else if (team == 2) {
                        System.out.println("The average points scored per half for junior varsity is:");
                        jvarsity.averageHalf();
                    }
                    break;
                case 3:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average points scored per game for varsity is:");
                        varsity.averageGame();
                    }
                    else if (team == 2) {
                        System.out.println("The average points scored per game for varsity is:");
                        jvarsity.averageGame();
                    }
                    break;
                case 4:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average point differential by quarter for varsity is: ");
                        System.out.println("Q1: " + (varsity.getQ1() - vOpp.getQ1()) + "\n" +
                                "Q2: " + (varsity.getQ2() - vOpp.getQ2()) + "\n" +
                                "Q3: " + (varsity.getQ3() - vOpp.getQ3()) + "\n" +
                                "Q4: " + (varsity.getQ4() - vOpp.getQ4()) + "\n");
                    }
                    else if (team == 2){
                        System.out.println("The average point differential by quarter for junior varsity is: ");
                        System.out.println("Q1: " + (jvarsity.getQ1() - jvOpp.getQ1()) + "\n" +
                                "Q2: " + (jvarsity.getQ2() - jvOpp.getQ2()) + "\n" +
                                "Q3: " + (jvarsity.getQ3() - jvarsity.getQ3()) + "\n" +
                                "Q4: " + (jvarsity.getQ4() - jvOpp.getQ4()) + "\n");
                    }
                    break;
                case 5:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average point differential by half for varsity is:");
                        System.out.println("H1: " + ((varsity.getQ1() + varsity.getQ2()) - (vOpp.getQ1() + vOpp.getQ2())) + "\n" +
                                "H2: " + ((varsity.getQ3() + varsity.getQ4()) - (vOpp.getQ3() + vOpp.getQ4())) + "\n");
                    }
                    else if (team == 2){
                        System.out.println("The average point differential by half for junior varsity is:");
                        System.out.println("H1: " + ((jvarsity.getQ1() + jvarsity.getQ2()) - (jvOpp.getQ1() + jvOpp.getQ2())) + "\n" +
                                "H2: " + ((jvarsity.getQ3() + jvarsity.getQ4()) - (jvOpp.getQ3() + jvOpp.getQ4())) + "\n");
                    }
                    break;
                case 6:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The average point differential by game for varsity is:");
                        System.out.println("Average: " + (varsity.getGame() - vOpp.getGame()));
                    }
                    else if (team == 2){
                        System.out.println("The average point differential by game for junior varsity is:");
                        System.out.println("Average: " + (jvarsity.getGame() - jvOpp.getGame()));
                    }
                    break;
                case 7:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The highest quarter score for varsity is:");
                        System.out.println("Highest: " + varsity.highGame());
                    }
                    else if (team == 2){
                        System.out.println("The highest quarter score for junior varsity is:");
                        System.out.println("Highest: " + jvarsity.highGame());
                    }
                    break;
                case 8:
                    System.out.println("Which team (1: Varsity, 2: Junior Varsity)?");
                    team = in.nextInt();
                    if (team == 1) {
                        System.out.println("The lowest quarter score for varsity is:");
                        System.out.println("Highest: " + varsity.lowGame());
                    }
                    else if (team == 2){
                        System.out.println("The lowest quarter score for junior varsity is:");
                        System.out.println("Highest: " + jvarsity.lowGame());
                    }
                    break;
                case 9:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("You entered an incorect selection. Please try again.");
            }

        } while (choice != 9);


    }
}

