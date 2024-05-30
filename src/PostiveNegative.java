/* Create a program that determines if a number is postive, negative or zero.*/

import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Your Entered Number is Positive");
        } else if (num==0) {
            System.out.println("Your Entered Number is Zero");
        } else {
            System.out.println("Your Entered Number is Negative");
        }

    }
}
