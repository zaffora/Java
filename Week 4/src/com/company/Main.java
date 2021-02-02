package com.company;

import java.util.Scanner;

public class Main {

    // Scanner declared as static, so it can be used anywhere in this class
// without having an instance of the class Driver
// In practice, it is similar to a global variable, but the underlying
// concept is NOT the same.
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int team1[] = new int[4];
        int team2[] = new int[4];

        for (int qtr = 0; qtr < 4; qtr++) {
            quarterScoring(team1, team2, qtr);
        }

        int team1Total = teamTotal(team1);
        int team2Total = teamTotal(team2);

        displayGameResults(team1, team2);

        if (team1Total > team2Total) {
            System.out.println("Team 1 has won the game!");
        } else {
            System.out.println("Team 2 has won the game!");
        }
    }

    static int teamTotal(int[] team) {
// This method will add the points a team has scored during all four quarters of a game.
        int total = 0;
        for (int i=0; i<4; i++){
            total += team[i];
        }
        return total;
    }

    static void quarterScoring(int[] team1, int[] team2, int qtr) {
// This method will continue to prompt user which team scored, and how many points are scored
// When this method finishes, the appropriate team's score for the quarter will be assigned
        System.out.println("Enter the Score for team 1 Q" + (qtr + 1) + ": ");
        int score = keyboard.nextInt();
        team1[qtr] = score;
        System.out.println("Enter the Score for team 2 Q" + (qtr + 1) + ": ");
        score = keyboard.nextInt();
        team2[qtr] = score;
    }

    static void displayGameResults(int[] team1, int[] team2) {
// This method will display the scores for each team per quarter as well as the total score
        System.out.println("For team 1 the quarterly scores are:\n");
        for(int i=0; i<4; i++){
            System.out.println("Q" + (i+1) + ": " + team1[i] + "\n");
        }
        System.out.println("For team 2 the quarterly scores are:\n");
        for(int i=0; i<4; i++) {
            System.out.println("Q" + (i + 1) + ": " + team2[i] + "\n");
        }

    }
}