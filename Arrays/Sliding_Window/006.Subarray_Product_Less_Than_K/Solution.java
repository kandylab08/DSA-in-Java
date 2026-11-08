class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;

        int left = 0;
        long curPrdt = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            curPrdt *= nums[right];

            while (curPrdt >= k) {
                curPrdt /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
