public class BoundaryTraversal {
    public static void printBoundary(int[][] matrix, int rows, int cols) {
        if (rows == 1) {
            // Only one row
            for (int i = 0; i < cols; i++)
                System.out.print(matrix[0][i] + " ");
        } else if (cols == 1) {
            // Only one column
            for (int i = 0; i < rows; i++)
                System.out.print(matrix[i][0] + " ");
        } else {
            // 1. Top row
            for (int i = 0; i < cols; i++)
                System.out.print(matrix[0][i] + " ");

            // 2. Right column
            for (int i = 1; i < rows; i++)
                System.out.print(matrix[i][cols - 1] + " ");

            // 3. Bottom row
            for (int i = cols - 2; i >= 0; i--)
                System.out.print(matrix[rows - 1][i] + " ");

            // 4. Left column
            for (int i = rows - 2; i >= 1; i--)
                System.out.print(matrix[i][0] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.print("Boundary Traversal: ");
        printBoundary(matrix, rows, cols);
    }
}
