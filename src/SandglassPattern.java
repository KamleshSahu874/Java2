import java.util.Scanner;

public class SandglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (half height): ");
        int n = sc.nextInt();

        // Inverted Hollow Pyramid
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars and spaces
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Normal Hollow Pyramid
        for (int i = 1; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i - 0; j++) {
                System.out.print(" ");
            }

            // Stars and spaces
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
