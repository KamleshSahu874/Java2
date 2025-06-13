import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a perfect square number (like 9, 16, 25): ");
        int input = sc.nextInt();

        int n = (int)Math.sqrt(input);
        if (n * n != input) {
            System.out.println("Please enter a perfect square (like 4, 9, 16, 25, ...)");
            return;
        }

        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= input) {
            for (int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;

            for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
            bottom--;

            for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", matrix[i][j]); // formatted spacing
            }
            System.out.println();
        }
    }
}
