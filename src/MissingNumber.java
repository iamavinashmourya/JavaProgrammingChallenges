/* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the
one that is missing from the array. */

public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] input = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(input));
    }
}
