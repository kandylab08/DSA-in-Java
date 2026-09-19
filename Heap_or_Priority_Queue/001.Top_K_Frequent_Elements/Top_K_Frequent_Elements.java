import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        // Count frequencies
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        // Min Heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (n1, n2) -> Integer.compare(mp.get(n1), mp.get(n2))
        );

        // Keep only k most frequent elements
        for (int n : mp.keySet()) {
            minHeap.add(n);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Build result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}