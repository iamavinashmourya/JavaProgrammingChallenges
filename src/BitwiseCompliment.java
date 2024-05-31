/* Create a Program that shows bitwise Compliment of two numbers */

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is: "+result);
    }
}
