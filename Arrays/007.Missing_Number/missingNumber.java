class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = 0l;
        for (int num : nums)
            sum += num;
        return (int) ((n * (n + 1) / 2) - sum);
    }
}