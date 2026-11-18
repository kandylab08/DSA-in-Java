# Day 55 – Maximum Subarray Sum With Length Divisible by K

**Problem:** [LeetCode 3381 – Maximum Subarray Sum With Length Divisible by K]

**Difficulty:** Medium

**Topic:** Arrays, Prefix Sum, Modulo Arithmetic

### Approach: Prefix Sum + Minimum Prefix Tracking

- Maintained a running prefix sum while traversing the array.
- Used a `minPrefix` array to store the minimum prefix sum for each remainder.
- Calculated the remainder using `(j + 1) % k` to group prefix sums based on their indices.
- Subtracted the minimum previously encountered prefix sum with the same remainder from the current prefix sum to obtain the maximum valid subarray sum.
- Updated the minimum prefix sum for each remainder after calculating the candidate answer.
- Used `long` to prevent integer overflow, including when handling large positive or negative sums.

### Key Concepts Learned

- Prefix sums with modulo arithmetic.
- Finding maximum subarray sums using minimum prefix values.
- Grouping prefix sums by index remainder.
- Handling negative numbers and integer overflow.

### Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(k)

### Key Takeaway

When the length of a subarray must be divisible by `k`, its two prefix indices must have the same remainder when divided by `k`. Maintaining the minimum prefix sum for each remainder allows us to find the maximum valid subarray sum efficiently in a single traversal.