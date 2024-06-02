/*Create a program to check if a number is an Armstrong number*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if (isArmstrong){
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int digits = noOfDigits(num);
        int numNewV = num;
        System.out.println("No of digits: "+digits);
        int finalNumber = 0;
        while (num>0){
            int lastdigit = num % 10;
            num/=10;
            finalNumber+=pow(lastdigit,digits);
        }
        return finalNumber==numNewV;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i=0;
        while (i<num2){
            result*=num1;
            i++;
        }
        System.out.println("Pow of" + num1 + "is "+result);
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
