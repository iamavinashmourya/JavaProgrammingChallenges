/* Create a program that categorize a person into different age groups.
child -> below 13
teen -> below 20
adult -> below 60
senior citizen -> above 60*/

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENter your age: ");
        int age = input.nextInt();

        if (age >= 65){
            System.out.println("You are senior citizen");
        } else if (age >= 20) {
            System.out.println("You are adult");
        } else if (age >= 13) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are child");
        }
    }
}
