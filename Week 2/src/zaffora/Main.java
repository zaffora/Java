// Domenico Zaffora
// INT 261 - 401
// Calculator App Week 2
package zaffora;
import java.util.Scanner;

public class Main {

    public static <Intiger, Int> void main(String[] args) {
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please type in the math operation you would like to complete:");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        int Operation = choice.nextInt();  // Gets the operand

        System.out.println("What is the first number you want to use? ");
        int Num1 = choice.nextInt(); // gets first intiger
        System.out.println("What is the second number you want to use? ");
        int Num2 = choice.nextInt(); // gets second intiger
        float Resault = 0;

        switch (Operation){
            case 1:
                Resault = Num1 + Num2;
                System.out.printIn("The resault for '+' is: " + Resault);
                break;
            case 2:
                Resault = Num1 - Num2;
                System.out.printIn("The resault for '-' is: "Resault);
                break;
            case 3:
                Resault = Num1 * Num2;
                System.out.printIn("The resault for '*' is: "Resault);
                break;
            case 4:
                Resault = Num1 / Num2;
                System.out.println("The resault for '/' is: "Resault);
                break;
            default:
                System.out.println("You selected an inapropriate operand. Please try again.");
        }

        }





    }
}
