/*
Write a program that reads a string from the user and counts the number of vowels and consonants in it.
 */

import java.util.Scanner;

public class VowelsAndConsonantsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(s);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    public static int[] countVowelsAndConsonants(String s) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        return new int[] { vowelsCount, consonantsCount };
    }
}
