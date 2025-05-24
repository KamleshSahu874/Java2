import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Input is null or empty.");
            }

            System.out.println("Uppercase: " + input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}

