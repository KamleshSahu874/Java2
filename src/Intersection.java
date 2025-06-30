import java.util.*;

public class Intersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        List<Integer> result = new ArrayList<>();

        while (i < n && j < m) {
            while (i > 0 && i < n && arr1[i] == arr1[i - 1]) i++;
            while (j > 0 && j < m && arr2[j] == arr2[j - 1]) j++;

            if (i < n && j < m) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 5, 6};

        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection: " + intersection);
    }
}
