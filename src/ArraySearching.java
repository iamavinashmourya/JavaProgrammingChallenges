/* Create a Program searching array element in array  */

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        int[] arr={8,87,84,78,79,23};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number want to search");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if (isFound){
            System.out.println("Your number found in array");
        } else {
            System.out.println("Your Number not found");
        }

    }
    public static boolean isFound(int[] arr, int num){
        int index=0;
        while (index<arr.length){
            if (arr[index]==num) {
                return true;
            }
            index++;
        }
        return false;
    }
}