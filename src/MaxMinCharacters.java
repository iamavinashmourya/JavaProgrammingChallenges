/*
Write a program that reads a string from the user and finds the maximum and minimum characters in it. If there are multiple characters with the same maximum or minimum frequency, print any of them.

Requirements:
Read a string from the user.
Find and print the maximum and minimum characters in the string.
 */

import java.util.Scanner;

public class MaxMinCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        char maxChar = '\0', minChar = '\uffff'; // Initialize maxChar and minChar
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                char currentChar = (char) i;
                if (currentChar > maxChar) {
                    maxChar = currentChar;
                }
                if (currentChar < minChar) {
                    minChar = currentChar;
                }
            }
        }

        System.out.println("Maximum character: " + maxChar);
        System.out.println("Minimum character: " + minChar);
    }
}
