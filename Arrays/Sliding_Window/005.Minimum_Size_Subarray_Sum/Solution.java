class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minSubArr = Integer.MAX_VALUE;
        int curSum = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];

            while (curSum >= target) {
                minSubArr = Math.min(minSubArr, right - left + 1);
                curSum -= nums[left];
                left++;
            }
        }

        return minSubArr == Integer.MAX_VALUE ? 0 : minSubArr;
    }
}