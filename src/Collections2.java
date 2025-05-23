
import java.util.ArrayList;

public class Collections2 {
    public static void main(String[] args) {
        int[] intArr = {5, 2, 8, -1, 4, 8};

        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : intArr) {
            arr.add(num);
        }

        System.out.println("Original ArrayList: " + arr);

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}


