/* Create a Program that shows use of Left Shift operator */

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Result is: "+result);
    }
}
