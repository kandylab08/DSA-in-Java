# Day 58 – Maximum Sum of Two Non-Overlapping Subarrays

**Problem:** [Maximum Sum of Two Non-Overlapping Subarrays – LeetCode 1031]

**Difficulty:** Medium

**Topics:** Arrays, Sliding Window, Fixed-Size Sliding Window, Greedy

## Approach: Sliding Window with Running Maximum

1. Implement a helper method `maxSumOrdered()` that handles the case where the L-length subarray appears before the M-length subarray.
2. Initialize two adjacent sliding windows and calculate their initial sums.
3. Maintain `maxL` to store the maximum sum of any L-length window encountered so far.
4. Slide both windows forward:
   - Update the L window by adding the incoming element and removing the outgoing element.
   - Update the M window similarly.
5. Update `maxL` and calculate the maximum combined sum.
6. Call the helper method twice, swapping `firstLen` and `secondLen`, to cover both possible arrangements.
7. Return the maximum result from both arrangements.

## Complexity Analysis

- **Time Complexity:** O(n) – Each helper method traverses the array once. Both arrangements require two linear traversals.
- **Space Complexity:** O(1) – Only a constant number of variables are used.

## Key Concepts Learned

- Fixed-size sliding window.
- Maintaining a running maximum.
- Updating window sums in O(1).
- Handling two non-overlapping subarrays in both possible orders.
- Optimizing nested comparisons using a running maximum.

## Key Takeaway

Instead of checking every possible pair of non-overlapping subarrays, maintain the maximum sum of the first window while sliding the second window. This reduces the solution to O(n) time and O(1) auxiliary space.