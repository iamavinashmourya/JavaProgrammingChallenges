/* Create a program that determines if a given year is a leap year
(considering conditions like divisible by 4 but not 100, unless also divisible by 400)*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Leap Year Calculator");
        System.out.print("Enter Year to Verify: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
            System.out.println("Your Entered Year is Leap Year");
        } else {
            System.out.println("Your Entered Year is not Leap Year ");
        }
    }
}
