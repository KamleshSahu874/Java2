import java.util.Scanner;

public class FilledSandglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (half height): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            int start = i + 1;
            int end = 2 * (n - i) - 1;


            for (int j = 0; j < end; j++) {
                System.out.print(start + j);
            }

            System.out.println();
        }


        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int start = n - i + 1;
            int end = 2 * i - 1;
            for (int j = 0; j < end; j++) {
                System.out.print(start + j);
            }

            System.out.println();
        }

        sc.close();
    }
}
