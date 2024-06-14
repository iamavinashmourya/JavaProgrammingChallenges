/*
Write a program that reads an integer from the user and repeatedly calculates the sum of its digits until a single digit is obtained. This single digit is known as the digital root.
 */

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitalRoot = findDigitalRoot(number);
        System.out.println("The digital root of " + number + " is: " + digitalRoot);
    }

    public static int findDigitalRoot(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
