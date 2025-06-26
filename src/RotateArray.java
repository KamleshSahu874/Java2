import java.util.*;

public class RotateArray {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first position
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateByOne(arr);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
