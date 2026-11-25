class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(
                maxSumOrdered(nums, firstLen, secondLen),
                maxSumOrdered(nums, secondLen, firstLen));
    }

    private int maxSumOrdered(int[] nums, int L, int M) {
        int sumL = 0;
        for (int i = 0; i < L; i++) {
            sumL += nums[i];
        }

        int sumM = 0;
        for (int i = L; i < L + M; i++) {
            sumM += nums[i];
        }
        int maxL = sumL;
        int result = maxL + sumM;
        for (int i = L + M; i < nums.length; i++) {
            sumL += nums[i - M] - nums[i - L - M];
            sumM += nums[i] - nums[i - M];

            maxL = Math.max(maxL, sumL);
            result = Math.max(result, maxL + sumM);
        }
        return result;
    }
}