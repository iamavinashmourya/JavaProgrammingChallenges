/*Create a program to check if the given array is sorted*/

public class isSortedArray {
    public static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDis = isDecreasing(numArr);

        if (isInc || isDis){
            System.out.println("your array are sorted");
        } else {
            System.out.println("Your array not sorted");
        }
    }
    public static boolean isIncreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
