import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> hs1 = new HashSet<>();
        for (int num : nums1) {
            hs1.add(num);
        }
        for (int num : nums2) {
            if (hs1.contains(num)) {
                res.add(num);
                hs1.remove(num);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}