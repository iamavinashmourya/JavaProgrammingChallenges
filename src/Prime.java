/*Create a program to check whether a given number is prime*/

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
