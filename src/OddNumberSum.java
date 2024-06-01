/* Create a program to sum all odd numbers from 1 to a specified number N.*/

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd Sum Till "+num+" is "+sum);
    }

    public static int oddSum(int num){
        int i=1;
        int sum =0;
        while (i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
