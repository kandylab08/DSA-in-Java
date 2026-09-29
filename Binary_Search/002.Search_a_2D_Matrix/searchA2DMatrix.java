class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowRow = 0;
        int highRow = matrix.length - 1;
        int midRow = 0;
        int lowCol = 0;
        int highCol = matrix[0].length - 1;

        while (lowRow <= highRow) {
            midRow = lowRow + (highRow - lowRow) / 2;
            if (matrix[midRow][0] <= target && matrix[midRow][highCol] >= target)
                break;
            else if (matrix[midRow][0] < target)
                lowRow = midRow + 1;
            else
                highRow = midRow - 1;
        }

        if (lowRow > highRow)
            return false;

        while (lowCol <= highCol) {
            int midCol = lowCol + (highCol - lowCol) / 2;
            if (matrix[midRow][midCol] == target)
                return true;
            else if (matrix[midRow][midCol] < target)
                lowCol = midCol + 1;
            else
                highCol = midCol - 1;
        }
        return false;
    }
}