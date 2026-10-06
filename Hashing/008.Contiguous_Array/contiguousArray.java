class Solution {
    public int findMaxLength(int[] nums) {
        int[] count = new int[2];
        int maxCount = 0;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

            int difference = count[0] - count[1];

            if (mp.containsKey(difference)) {
                maxCount = Math.max(maxCount, i - mp.get(difference));
            } else {
                mp.put(difference, i);
            }
        }

        return maxCount;
    }
}