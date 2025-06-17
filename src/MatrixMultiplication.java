import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter rows of Matrix A: ");
        int m = sc.nextInt();
        System.out.print("Enter columns of Matrix A / rows of Matrix B: ");
        int n = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int p = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] result = new int[m][p];

        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                result[i][j] = 0;
                for(int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
