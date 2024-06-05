/* Create a program to find the sum of two diagonal elements */

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("Sum of diagonal is: "+sum);
    }
    public static long sumOfDiagonal(int[][] numArr){
        long leftSum=SumOfLeftDiagonal(numArr);
        long RightSum=SumOfRightDiagonal(numArr);
        long sum = leftSum+RightSum;
        if (numArr.length % 2!=0){
            int ind = numArr.length/2;
            sum-=numArr[ind][ind];
        }
        return sum;
    }

    public static long SumOfLeftDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while (i< numArr.length){
            sum+=numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long SumOfRightDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while (i<numArr.length){
            int col= numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;
    }
}
