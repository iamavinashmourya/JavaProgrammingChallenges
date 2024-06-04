/* Create a program to find number of occurrences of an element in an array.*/

import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter number want to Search: ");
        int num = inout.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("Your element found "+occurrences+" Times in the array: ");
    }
    public static int noOfOccurrences(int[] numArr, int num){
        int occ=0;
        int i=0;
        while (i<numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
