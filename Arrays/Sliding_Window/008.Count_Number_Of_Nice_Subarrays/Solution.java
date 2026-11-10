class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0, currentOdds = 0, totalCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                currentOdds++;
            }

            while (currentOdds > k) {
                if (nums[left] % 2 != 0) {
                    currentOdds--;
                }
                left++;
            }

            totalCount += (right - left + 1);
        }

        return totalCount;
    }
}