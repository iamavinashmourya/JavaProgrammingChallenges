/* Write a Java program to convert a given decimal number to binary. */

public class DecimalToBinary {
    public static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        int input = 10;
        System.out.println(toBinary(input));
    }
}
