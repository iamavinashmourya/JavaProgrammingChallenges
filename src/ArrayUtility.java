import java.util.Scanner;

public class ArrayUtility {
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

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];


        int i=0;
        while (i<rows){
            int j=0;
            while (j<columns){
                System.out.print("Enter elements of rows: "+(i+1)+ ",columns: "+(j+1)+" : ");
                numArray[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray){
        int i=0;
        while (i<numArray.length){
            System.out.print(numArray[i]+" ");
            i++;
        }
        System.out.println();
    }
}
