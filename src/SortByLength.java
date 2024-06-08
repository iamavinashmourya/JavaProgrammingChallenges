/* Write a Java program to sort an array of strings by their lengths. */

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public static void sortByLength(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(String::length));
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "kiwi", "cherry"};
        sortByLength(input);
        System.out.println(Arrays.toString(input));
    }
}
