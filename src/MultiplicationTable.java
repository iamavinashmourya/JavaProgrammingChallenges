/* Develop a program that prints the multiplication table for a given number*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        printTable(num);
    }
    public static void printTable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }

    }
}

