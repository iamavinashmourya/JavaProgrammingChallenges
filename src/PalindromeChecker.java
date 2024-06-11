/*
Write a program that reads a string from the user and checks if it is a palindrome. A palindrome is a string that reads the same forward and backward. Ignore case and non-alphanumeric characters.
 */

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        boolean isPalindrome = isPalindrome(s);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        String filtered = filteredString.toString();
        String reversed = filteredString.reverse().toString();
        return filtered.equals(reversed);
    }
}
