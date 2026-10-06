import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
        for (int num : nums) {
            curSum += num;
            if (prefixSums.containsKey(curSum - k)) {
                res += prefixSums.get(curSum - k);
            }
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}