//import java.util.Arrays;

public class Median {
    // Function to find median
    public static int findMedian(int[][] matrix, int R, int C) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < R; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][C - 1]);
        }

        int desired = (R * C + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;

            int count = 0;
            for (int i = 0; i < R; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    private static int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        int R = matrix.length;
        int C = matrix[0].length;

        System.out.println("Median is: " + findMedian(matrix, R, C)); // Output: 5
    }
}
