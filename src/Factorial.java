/*Write function that calculates the factorial of a given number*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("enter your number: ");
        int num= input.nextInt();
        long fact = facValue(num);
        System.out.println("Factorial is: "+fact);
    }
    public static long facValue(int num){
        if (num<2){
            return 1;
        }
        long fact =1;
        int i=2;
        while (i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
