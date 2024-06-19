/*
Write a program that tracks the completion of a daily habit (e.g., exercise, reading) over a month (30 days). The user will input a series of 30 boolean values (true for habit completed, false for not completed). The program should calculate the longest streak of consecutive days the habit was completed and the total number of days the habit was completed.
 */

import java.util.Scanner;

public class HabitTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] habitCompletion = new boolean[30];

        System.out.println("Enter habit completion for 30 days (true/false):");
        for (int i = 0; i < 30; i++) {
            habitCompletion[i] = scanner.nextBoolean();
        }

        int longestStreak = 0;
        int currentStreak = 0;
        int totalCompletedDays = 0;

        for (int i = 0; i < 30; i++) {
            if (habitCompletion[i]) {
                totalCompletedDays++;
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Longest streak: " + longestStreak + " days");
        System.out.println("Total completed days: " + totalCompletedDays);
    }
}
