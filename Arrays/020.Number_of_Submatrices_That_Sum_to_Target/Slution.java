import java.util.HashMap;
import java.util.Map;
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1] + prefixSum[i][j - 1];
            }
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int c1 = 1; c1 <= n; c1++) {
            for (int c2 = c1; c2 <= n; c2++) {
                map.clear();
                map.put(0, 1);
                int curSum = 0;
                for (int row = 1; row <= m; row++) {
                    curSum += prefixSum[row][c2] - prefixSum[row][c1 - 1];
                    count += map.getOrDefault(curSum - target, 0);
                    map.put(curSum, map.getOrDefault(curSum, 0) + 1);
                }
            }
        }
        return count;
    }
}