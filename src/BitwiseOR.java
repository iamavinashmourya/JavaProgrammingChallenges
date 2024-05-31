/* Create a Program that shows bitwise OR of two numbers. */

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int NumFirst = input.nextInt();
        System.out.print("Enter the other number: ");
        int NumSecond = input.nextInt();

        int result = NumFirst | NumSecond;
        System.out.println("Result is: "+ result);
    }
}
