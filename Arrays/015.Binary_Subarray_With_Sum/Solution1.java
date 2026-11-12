// This solution is not optimal and it fails in an edge case where nums = [0,0,0,0,0] and goal = 0. The expected output is 15 but the output of this solution is 10.

class Solution1 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int sum = 0;
        int count = 0;
        int prefixZeros = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (left <= right && sum > goal) {
                sum -= nums[left];
                left++;
                prefixZeros = 0;
            }

            if (sum == goal) {
                while (left <= right && nums[left] == 0 && sum == goal) {
                    prefixZeros++;
                    left++;
                }

                count += prefixZeros + 1;
            }
        }

        return count;
    }
}