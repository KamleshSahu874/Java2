import java.util.*;

public class SumOfOddNo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 7, 4, 9, 2, 5);

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers: " + sum);
    }
}
