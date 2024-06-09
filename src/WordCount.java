/*
Write a program that reads a sentence from the user and counts the number of words in the sentence. Print the result.

Requirements:
Read a sentence from the user.
Count the number of words in the sentence.
Print the number of words.
*/

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("The number of words is: " + wordCount);
    }
}
