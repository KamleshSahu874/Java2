
import java.util.TreeSet;

public class Collections3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5};
        TreeSet<Integer> uniqueSet = new TreeSet<>();
        for (int i : arr) {
            if(uniqueSet.contains(i)) {
                System.out.println("Duplicate found: " + i);
            } else {
                uniqueSet.add(i);
            }
        }
    }
}
