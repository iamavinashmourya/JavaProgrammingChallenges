/*
Write a program that reads a string from the user and finds the length of the longest substring without repeating characters.
 */

import java.util.HashMap;
import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int length = longestUniqueSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    public static int longestUniqueSubstring(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int start = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                start = charIndex.get(currentChar) + 1;
            }
            charIndex.put(currentChar, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
