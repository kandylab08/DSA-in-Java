import java.util.HashSet;
import java.util.Set;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums)
            numSet.add(num);

        int longestStreak = 0;

        for (int elem : numSet) {
            if (!numSet.contains(elem - 1)) {

                int curNum = elem;
                int curLength = 1;

                while (numSet.contains(curNum + 1)) {
                    curNum += 1;
                    curLength += 1;
                }

                longestStreak = Math.max(longestStreak, curLength);
            }
        }

        return longestStreak;
    }
}