import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    int aboveLeft = triangle.get(row - 1).get(col - 1);
                    int aboveRight = triangle.get(row - 1).get(col);
                    currentRow.add(aboveLeft + aboveRight);
                }
            }

            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
