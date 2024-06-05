/* Create a program to do sum and average of all elements in a 2-D array. */

public class SumAverage2DArray {
    public static void main(String[] args) {
        int[][] nums = ArrayUtility.input2DArray();
        long sum=sum(nums);
        double avg=avg(nums);
        System.out.println("Your sum of array is: "+sum);
        System.out.println("Your average is: "+avg);
    }
    public static long sum(int[][] numArr){
        long sum=0;
        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j<numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] numArr){
        if (numArr.length==0){
            return 0;
        }
        int rows= numArr.length;
        int columns = numArr[0].length;
        double size=rows*columns;
        return sum(numArr)/size;
    }
}
