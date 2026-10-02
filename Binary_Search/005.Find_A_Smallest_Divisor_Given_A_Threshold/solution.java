class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int n : nums) {
            high = Math.max(high, n);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (validDivisor(mid, nums, threshold))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    private boolean validDivisor(int mid, int[] nums, int threshold) {
        int sumOfQuotient = 0;
        for (int n : nums) {
            sumOfQuotient += (n + mid - 1) / mid;
            if (sumOfQuotient > threshold)
                return false;
        }
        return true;
    }
}