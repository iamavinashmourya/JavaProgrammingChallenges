/* Create a program to find the least common multiple (LCM) of two numbers.*/

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first= input.nextInt();
        System.out.print("Enter a number: ");
        int second= input.nextInt();
        int LCMVL = lcmFinder(first, second);
        System.out.println("LCM is: "+LCMVL);
    }
    public static int lcmFinder(int first, int Second){
        int i =1;
        while (true){
            int factor = first*i;
            if (factor % Second == 0 ){
                return factor;
            }
            i++;
        }

    }
}
