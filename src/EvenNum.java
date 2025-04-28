import java.util.Scanner;

public class EvenNum {

    public static void printEvenNumbers(int start, int end) {
        if (start > end) {
            System.out.println("Invalid range! Start should be less than or equal to end.");
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        printEvenNumbers(start, end);
        scanner.close();
    }
}

