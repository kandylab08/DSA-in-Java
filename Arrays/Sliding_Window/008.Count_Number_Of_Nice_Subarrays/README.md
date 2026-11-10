# Day 49 – Count Number of Nice Subarrays

**Problem:** LeetCode 1248 – Count Number of Nice Subarrays

**Difficulty:** Medium

**Topic:** Arrays, Sliding Window, At Most K Technique

## Problem Statement
Given an integer array `nums` and an integer `k`, count the number of contiguous subarrays containing exactly `k` odd numbers.

## Approach: Sliding Window (At Most K Technique)

Instead of directly counting subarrays containing exactly `k` odd numbers, we use:

**Exactly K = At Most K − At Most (K − 1)**

We create a helper function `atMost()` that counts the number of subarrays containing at most `k` odd numbers.

### Algorithm

1. Calculate `atMost(nums, k)`.
2. Calculate `atMost(nums, k - 1)`.
3. Subtract the second result from the first.
4. Inside `atMost()`:
   - Expand the window using the `right` pointer.
   - Increment `currentOdds` whenever an odd number enters the window.
   - If the number of odd elements exceeds `k`, shrink the window using the `left` pointer.
   - Add `right - left + 1` to the total count because all subarrays ending at `right` and starting within the current window are valid.

## Complexity Analysis

- **Time Complexity:** O(n) – The array is traversed twice through the helper function, and each traversal takes linear time.
- **Space Complexity:** O(1) – Only a constant number of variables are used.

## Key Concepts Learned

- Sliding Window technique.
- Counting valid subarrays ending at a particular index.
- At Most K technique.
- Converting an exactly K problem into two at-most K problems.
- Efficient subarray counting without generating individual subarrays.

## Key Takeaway

For problems asking to count subarrays containing exactly K occurrences of a particular property, consider using:

`Exactly(K) = AtMost(K) - AtMost(K - 1)`

This technique transforms an exact-counting problem into two manageable sliding window problems.

**Day 49 completed! 🚀**