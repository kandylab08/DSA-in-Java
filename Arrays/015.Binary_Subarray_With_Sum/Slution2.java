// This solution is optimal and it uses the sliding window technique to find the number of subarrays with a sum equal to the goal. It calculates the number of subarrays with a sum less than or equal to the goal and subtracts the number of subarrays with a sum less than or equal to (goal - 1) to get the final result.

class Solution2 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if (goal < 0)
            return 0;

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}