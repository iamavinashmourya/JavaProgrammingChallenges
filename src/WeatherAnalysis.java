/*
Write a program that reads a list of temperatures (in Celsius) for a week (7 days) from the user, calculates the average temperature, and determines the highest and lowest temperatures recorded. Additionally, classify the overall weather for the week based on the average temperature:

Below 10°C: Cold
Between 10°C and 25°C: Moderate
Above 25°C: Hot
 */

import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[7];

        System.out.println("Enter the temperatures for 7 days:");
        for (int i = 0; i < 7; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        double sum = 0;
        double highest = temperatures[0];
        double lowest = temperatures[0];

        for (int i = 0; i < 7; i++) {
            sum += temperatures[i];
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        double average = sum / 7;
        String weatherClassification;

        if (average < 10) {
            weatherClassification = "Cold";
        } else if (average <= 25) {
            weatherClassification = "Moderate";
        } else {
            weatherClassification = "Hot";
        }

        System.out.printf("Average temperature: %.2f°C%n", average);
        System.out.println("Highest temperature: " + highest + "°C");
        System.out.println("Lowest temperature: " + lowest + "°C");
        System.out.println("Overall weather: " + weatherClassification);
    }
}
