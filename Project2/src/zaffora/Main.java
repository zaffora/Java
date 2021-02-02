package zaffora;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
// Player's constructor should initialize the Player
// Initial location
        Player p1 = new Player();
// Obstacle's constructor should initialize the obstacle
// to a random location - which cannot overlap with p1 at 0, 0
        Obstacle obstacle = new Obstacle();
// After the following statement, name will have a valid name
// In other words, getValidName will have input validation
        String name = getValidName();
        p1.setName(name);
// After the following statement, the screen should display
// the player's name and position as well as the obstacle's position
        gameStatus(p1, obstacle);
    }

    public static String getValidName(){
        Scanner input = new Scanner(System.in);
//gets the name from player
        String tName = input.nextLine();
        String n;
// Checking to see if the name is less then 15 characters
        if(tName.length() < 15){
            n = tName;
        }
        else {
            System.out.println("Name must be less then 15 characters.");
        }

        return tName;
    }
// Printing the game status
    public static void gameStatus(Main p, Main o){
        String[][] board = new String[11][11];
// initializes th board array with -'s
        for (int i=0 ; i<11; i++){
            for(int j=0 ; j<11 ; j++){
                board[i][j] = "-";
            }
        }

        int pX, pY, oX, oY;

        System.out.println(p);
        System.out.println(o);
    }
}
