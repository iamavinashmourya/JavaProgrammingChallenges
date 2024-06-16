/*
Write a program that reads a string from the user and calculates the sum of the ASCII values of all the characters in the string. Print the result.
 */

import java.util.Scanner;

public class SumOfAsciiValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int asciiSum = 0;
        for (int i = 0; i < input.length(); i++) {
            asciiSum += input.charAt(i);
        }

        System.out.println("The sum of ASCII values of characters in the string is: " + asciiSum);
    }
}
