/* Create a program that calculates grades based on marks
A -> above 90%
B -> above 75%
C -> above 60%
D -> above 30%
F -> below 30% */

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Percentage: ");
        float percentage = input.nextInt();

        if (percentage >= 90) {
            System.out.println("You got A grade");
        } else if (percentage >= 75) {
            System.out.println("You got B grade");
        } else if (percentage >= 60) {
            System.out.println("You got C grade");
        } else if (percentage >= 30) {
            System.out.println("You got D grade");
        } else {
            System.out.println("Sorry you are failed");
        }
    }
}
