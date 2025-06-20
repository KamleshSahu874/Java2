import java.util.*;

public class PairSumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: target sum
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}