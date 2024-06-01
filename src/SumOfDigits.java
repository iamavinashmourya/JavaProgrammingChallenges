/* Create a program that computes the sum of digits of an integer*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digits = sumofDigit(num);
        System.out.println("Sum of digits is: "+digits);

    }
    public static int sumofDigit(int num){
        int sum =0;
        while (num>0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
