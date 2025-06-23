import java.util.*;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Input: matrix elements
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        // Snake pattern printing
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < cols; j++)
                    System.out.print(matrix[i][j] + " ");
            } else {
                // Right to left
                for (int j = cols - 1; j >= 0; j--)
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
