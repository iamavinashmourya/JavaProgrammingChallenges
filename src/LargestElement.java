/* Write a function that takes an array of integers and returns the largest element. */

public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {10, 24, 5, 3, 7, 25, 8};
        System.out.println("Largest element: " + findLargest(input));
    }
}

