import java.util.*;

public class CountAString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "banana", "Avocado", "apricot", "Mango", "almond", "Berry");

        long count = names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .count();
        System.out.println("Count of strings starting with 'A' or 'a': " + count);
    }
}
