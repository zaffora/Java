package zaffora;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // This 2 dimensional array holds scores for 82 games by quarter
        int[][] teamScores = new int[82][4];

// Initialize the array to random scores
        for (int game = 0; game < 82; game++) {
            for (int qtr = 0; qtr < 4; qtr++) {
// We will assign a random number between 5 and 30 for each quarter)
                teamScores[game][qtr] = (int)(Math.random()*25) + 5;
            }
        }

// View the scores for all games/quarters
        for (int game = 0; game < 82; game++) {
            System.out.println("\nGame: " + (game+1));
            for (int qtr = 0; qtr < 4; qtr++) {
                System.out.print("Q" + (qtr+1) + ": " + teamScores[game][qtr] + "\t");
            }
        }

        // Initialize the menu variable & create the menu
        int menu = 0;
        do {
            System.out.println("\n #### MENU #### \n");
            System.out.println("\n 1: View Q1 average score \n");
            System.out.println("\n 2: View Q2 average score \n");
            System.out.println("\n 3: View Q3 average score \n");
            System.out.println("\n 4: View Q4 average score \n");
            System.out.println("\n 5: View all score information for a game \n");
            System.out.println("\n 6: Exit. \n");

            // Get the menu selection
            int score = 0, avgScore;
        menu = keyboard.nextInt();

            switch (menu){
                case 1:

                    for (int game = 0; game < 82; game++) {

                        score += teamScores[game][1];
                    }
                    avgScore = score / 82;

                    System.out.println("\n The average score is " + avgScore + " for the first quarter.\n");
                    break;
                case 2:

                    for (int game = 0; game < 82; game++) {

                        score += teamScores[game][2];
                    }
                    avgScore = score / 82;

                    System.out.println("\n The average score is " + avgScore + " for the second quarter.\n");

                    break;
                case 3:

                    for (int game = 0; game < 82; game++) {

                        score += teamScores[game][3];
                    }
                    avgScore = score / 82;

                    System.out.println("\n The average score is " + avgScore + " for the third quarter.\n");

                    break;
                case 4:

                    for (int game = 0; game < 82; game++) {

                        score += teamScores[game][4];
                    }
                    avgScore = score / 82;

                    System.out.println("\n The average score is " + avgScore + " for the fourth quarter.\n");

                    break;
                case 5:
                    System.out.println("\n Which game scores would like to view (1-82)? \n");
                    int qGame = keyboard.nextInt();
                    System.out.println("\n Game " + qGame);
                    for (int qtr = 0; qtr < 4; qtr++){
                        System.out.print("Q" + (qtr+1) + ": " + teamScores[qGame][qtr] + "\t");
                    }


                    break;
                case 6:
                    System.out.println("\n Good Bye! \n");
                    break;
                default:
                    System.out.println("\n You entered an incorrect selection, Please try again. \n");

    }
} while (menu != 6);

    }
}
