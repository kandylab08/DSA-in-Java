## Day 53 – Continuous Subarray Sum

**Problem:** [Continuous Subarray Sum – LeetCode 523]

**Difficulty:** Medium

**Topic:** Arrays, Prefix Sum, HashMap, Remainder Mathematics

### Approach: Prefix Sum + HashMap

- Maintained a running prefix sum while traversing the array.
- Calculated the remainder of the prefix sum when divided by `k`.
- Used a HashMap to store the first occurrence of each remainder along with its index.
- If the same remainder appeared again, the difference between the two prefix sums was divisible by `k`.
- Checked whether the distance between the indices was at least 2 to satisfy the minimum subarray length requirement.
- Initialized the HashMap with `0 → -1` to handle subarrays starting from index `0`.
- Stored only the first occurrence of each remainder to maximize the possible subarray length.

### Complexity Analysis

- **Time Complexity:** O(n) – Traversed the array once.
- **Space Complexity:** O(min(n, |k|)) – Stored distinct prefix sum remainders.

### Key Learnings

- Equal prefix sum remainders indicate that the subarray between them has a sum divisible by `k`.
- Storing the first occurrence of a remainder helps maximize subarray length.
- `map.put(0, -1)` handles subarrays beginning at the first index.
- Prefix Sum + HashMap can solve both subarray counting and existence problems.
- Understood how the same mathematical pattern can be adapted by changing what information the HashMap stores.

**Day 53 Completed! 🚀**