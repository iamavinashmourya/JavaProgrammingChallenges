/* create program that determines the greatest of the three numbers. */

import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Second Number: ");
        int second = input.nextInt();
        System.out.print("Enter Third Number: ");
        int third = input.nextInt();

        if (first >= second && first>=third){
            System.out.println(first + " is greatest number");
        } else if (second>=third) {
            System.out.println(second + " is greatest number");
        } else {
            System.out.println(third + " is greatest of all time");
        }
    }
}
