class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPrefix = new long[k];
        for (int i = 1; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE / 2;
        }
        minPrefix[0] = 0;
        long currentPrefix = 0;
        long maxSum = Long.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            currentPrefix += nums[j];
            int rem = (j + 1) % k;
            if (minPrefix[rem] != Long.MAX_VALUE / 2) {
                maxSum = Math.max(maxSum, currentPrefix - minPrefix[rem]);
            }
            minPrefix[rem] = Math.min(minPrefix[rem], currentPrefix);
        }
        return maxSum;
    }
}