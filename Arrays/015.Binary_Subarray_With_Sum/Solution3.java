// This solution is optimal and it passes all the test cases including the edge case where nums = [0,0,0,0,0] and goal = 0. The expected output is 15 and the output of this solution is also 15.

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int required = prefixSum - goal;

            count += map.getOrDefault(required, 0);

            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}