/* Create a program to find the sum and average of all elements in an array. */

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] numArray = inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of number is: "+sum);
        System.out.println("Average of number is: "+avg);
    }

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of the elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i<size){
            System.out.print("Enter elements of number "+(i+1)+ ": ");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }

    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while (i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum=sum(numArray);
        return (sum/numArray.length);
    }
}
