import java.util.Scanner;

public class NaturalNum {

    public static void printNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        printNaturalNumbers(n);
        scanner.close();
    }
}

