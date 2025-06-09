import java.util.*;
import java.util.stream.Collectors;

public class UpperCaseName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sita", "Krishna", "Radha", "Mohan", "Ali");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered names: " + filteredNames);
    }
}
