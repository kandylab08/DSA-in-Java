import java.util.HashMap;
import java.util.Map;
class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int anotherNum = target - nums[i];

            if (mp.containsKey(anotherNum)) {
                return new int[] { mp.get(anotherNum), i };
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}