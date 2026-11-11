import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int v1 = 0, v2 = 0;

        for (int num : nums) {
            if (num == c1) {
                v1++;
            } else if (num == c2) {
                v2++;
            } else if (v1 == 0) {
                c1 = num;
                v1 = 1;
            } else if (v2 == 0) {
                c2 = num;
                v2 = 1;
            } else {
                v1--;
                v2--;
            }
        }

        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == c1)
                count1++;
            else if (num == c2)
                count2++;
        }

        List<Integer> res = new ArrayList<>();
        int threshold = nums.length / 3;

        if (count1 > threshold)
            res.add(c1);
        if (count2 > threshold && c1 != c2)
            res.add(c2);
        return res;
    }
}