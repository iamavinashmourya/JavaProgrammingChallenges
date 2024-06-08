/* Write a Java program to transpose a given matrix (swap rows with columns). */

import java.util.Arrays;

public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] transposed = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] result = transpose(input);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
