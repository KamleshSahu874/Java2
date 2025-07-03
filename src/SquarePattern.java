
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        sc.close();
    }
}
