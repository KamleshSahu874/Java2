
import java.util.*;
import java.util.stream.Collectors;

public class DuplicatePrice {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(800, 1500, 1200, 800, 2000, 1500, 950, 3000);

        int total = prices.stream()
                .distinct()
                .filter(p -> p > 1000)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Total sum of unique prices > 1000: " + total);
    }
}
