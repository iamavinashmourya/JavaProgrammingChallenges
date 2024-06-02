/* Create a program to reverse the digits of a number */

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of number is: "+reverse);
    }
    public static int reverse (int num){
        int newNum = 0;
        while (num>0){
            int digit = num % 10;
            newNum=newNum*10+digit;
            num /=10;
        }
        return newNum;
    }
}
