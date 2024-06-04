/* Create a program to return a new array deleting a specific element.  */

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter number want to delete from Array: ");
        int deleteArr = input.nextInt();
        int[] newArr = deleteNumber(numArr,deleteArr);
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int deleteArr){
        int occurrence = OccurrencesArray.noOfOccurrences(numArr,deleteArr);
        if (occurrence==0){
            return numArr;
        }
        int newSize = numArr.length - occurrence;
        int[] newArr = new int[newSize];

        int i=0;
        int j=0;

        while (i<numArr.length){
            if (numArr[i] != deleteArr){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
