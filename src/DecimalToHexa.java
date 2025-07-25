import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();


        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int n = decimal;
        while (n > 0) {
            int remainder = n % 16;
            hex = hexChars[remainder] + hex;
            n = n / 16;
        }
        System.out.println("Hexadecimal of " + decimal + " is: " + hex);

        sc.close();
    }
}
