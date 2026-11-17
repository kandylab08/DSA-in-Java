# Day 54 – Minimum Operations to Reduce X to Zero

**Problem:** LeetCode 1658 – Minimum Operations to Reduce X to Zero

**Difficulty:** Medium

**Topics:** Arrays, Prefix Sum, HashMap, Sliding Window, Two Pointers

## Problem Statement

Given an integer array `nums` and an integer `x`, in one operation, we can remove either the leftmost or rightmost element and subtract its value from `x`.

Return the minimum number of operations required to reduce `x` to exactly zero. If it is impossible, return `-1`.

---

## Approach 1: Prefix Sum + Suffix Sum + HashMap

### Intuition

Instead of directly simulating removals, calculate the sum of elements removed from both ends.

We can divide the solution into three possibilities:

1. Remove elements only from the left.
2. Remove elements only from the right.
3. Remove elements from both ends.

### Algorithm

- Calculate prefix sums and store their earliest indices in a HashMap.
- Traverse the array from right to left, maintaining the suffix sum.
- If the suffix sum equals `x`, update the operation count.
- Otherwise, calculate the required prefix sum:

  `complement = x - suffixSum`

- Check whether the complement exists in the HashMap.
- Ensure that the prefix and suffix do not overlap.
- Update the minimum number of operations.

### Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## Approach 2: Sliding Window (Optimized)

### Key Observation

Instead of finding the minimum elements to remove from both ends, we can find the longest contiguous subarray that we should keep.

Let:

`totalSum = sum of all elements`

The sum of the remaining subarray must be:

`target = totalSum - x`

Therefore:

**Minimum Operations = Array Length - Maximum Length of Remaining Subarray**

Our task becomes finding the longest subarray whose sum equals `target`.

### Algorithm

1. Calculate the total sum of the array.
2. Calculate `target = totalSum - x`.
3. If `target < 0`, return `-1` because the total array sum is insufficient.
4. If `target == 0`, return the entire array length because every element must be removed.
5. Use two pointers (`left` and `right`) to maintain a sliding window.
6. Expand the window by adding `nums[right]`.
7. While the current sum exceeds the target, shrink the window from the left.
8. Whenever the current sum equals the target, update the maximum window length.
9. Return `nums.length - maxLen`, or `-1` if no valid subarray exists.

### Complexity Analysis

- **Time Complexity:** O(n) — Each element enters and leaves the sliding window at most once.
- **Space Complexity:** O(1) — Only a constant number of variables are used.

---

## Important Concepts Learned

- Transforming a removal-based problem into a subarray problem.
- Prefix sums and suffix sums.
- Using HashMaps to store prefix sums and their earliest indices.
- Finding complementary sums.
- Avoiding overlapping prefix and suffix selections.
- Sliding window with variable window size.
- Finding the longest subarray with a given sum.
- Optimizing auxiliary space from O(n) to O(1).

## Key Takeaway

The most important insight from this problem:

Instead of finding the minimum elements to remove from both ends, find the maximum-length subarray to retain.

`Minimum Operations = n - Maximum Retained Subarray Length`

This transformation turns the problem into a straightforward sliding window solution.

**Day 54 completed! 🚀**