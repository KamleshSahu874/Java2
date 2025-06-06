import java.util.List;

public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
    }
}
