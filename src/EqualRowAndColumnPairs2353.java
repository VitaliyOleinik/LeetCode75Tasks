import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs2353 {

    private static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        Map<String, Integer> rowCounter = new HashMap<>();
        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, 1 + rowCounter.getOrDefault(rowString, 0));
        }

        for (int c = 0; c < n; c++) {
            int[] colArray = new int[n];
            for (int r = 0; r < n; ++r) {
                colArray[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(colArray), 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{ {3, 1, 2, 2},
                                    {1, 4, 4, 5},
                                    {2, 4, 2, 2},
                                    {2, 4, 2, 2}};
        System.out.println(equalPairs(grid));
    }
}
