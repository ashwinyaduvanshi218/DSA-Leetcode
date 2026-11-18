import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Store merged intervals
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // If result is empty OR no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            }

            // If intervals overlap
            else {
                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: Convert List to 2D array
        return result.toArray(new int[result.size()][]);
    }
}