import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> evenList = list.stream()
                .map(n -> n * 5)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
