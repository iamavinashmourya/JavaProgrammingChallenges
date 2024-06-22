/*
Write a program that reads a list of weights (in kilograms) and heights (in meters) for a group of people from the user, calculates the Body Mass Index (BMI) for each person, and determines the BMI category based on the calculated value.
 */


import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();

        double[] weights = new double[numberOfPeople];
        double[] heights = new double[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1) + ":");
            weights[i] = scanner.nextDouble();
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfPeople; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String category;

            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24.9) {
                category = "Normal weight";
            } else if (bmi < 29.9) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }

            System.out.printf("Person %d: BMI = %.2f, Category = %s%n", i + 1, bmi, category);
        }
    }
}
