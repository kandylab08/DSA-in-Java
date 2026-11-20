class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] matSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                matSum[i][j] = mat[i - 1][j - 1] + matSum[i - 1][j] + matSum[i][j - 1] - matSum[i - 1][j - 1];
            }
        }
        int[][] resultMat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.min(m, i + k + 1);
                int c1 = Math.min(n, j + k + 1);
                int r2 = Math.max(0, i - k);
                int c2 = Math.max(0, j - k);
                resultMat[i][j] = matSum[r1][c1] - matSum[r2][c1] - matSum[r1][c2] + matSum[r2][c2];
            }
        }
        return resultMat;
    }
}