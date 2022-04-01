import java.util.Arrays;

public class BSIn2DArr {
    public static void main(String[] args) {
        // this is typical array sorted in row and column manner
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 45;
        System.out.println(Arrays.toString(search(matrix, target)));

    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[] { -1, -1 };
    }
}
