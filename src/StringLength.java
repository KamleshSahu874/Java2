import java.util.*;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "cat", "elephant", "dog", "sun");

        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Lengths of words: " + lengths);
    }
}
