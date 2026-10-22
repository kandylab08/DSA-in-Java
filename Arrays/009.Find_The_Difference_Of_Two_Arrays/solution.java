class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        
        for (int n : nums1)
            hs1.add(n);
        for (int n : nums2)
            hs2.add(n);

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        
        for (int n : hs1) {
            if (!(hs2.contains(n)))
                res1.add(n);
        }
        for (int n : hs2) {
            if (!(hs1.contains(n)))
                res2.add(n);
        }
        return Arrays.asList(res1, res2);
    }
}