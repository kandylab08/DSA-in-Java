# Day 43 – Minimum Size Subarray Sum

**LeetCode Problem:** [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)  
**Difficulty:** Medium  
**Topic:** Sliding Window, Two Pointers, Arrays  
**Language:** Java

## Problem Statement

Given an array of positive integers `nums` and a positive integer `target`, find the minimum length of a contiguous subarray whose sum is greater than or equal to `target`.

Return `0` if no such subarray exists.

## Approach: Variable-Size Sliding Window

Used the **Variable-Size Sliding Window** technique with two pointers to efficiently find the shortest valid subarray.

### Algorithm

1. Initialize two pointers, `left` and `right`, both starting at index `0`.
2. Maintain a variable `curSum` to store the sum of the current window.
3. Expand the window by moving `right` forward and adding the current element to `curSum`.
4. Whenever `curSum` becomes greater than or equal to `target`:
   - Update the minimum subarray length using `right - left + 1`.
   - Remove the element at the `left` pointer from `curSum`.
   - Move `left` forward to shrink the window.
5. Continue until all elements have been processed.
6. If no valid subarray is found, return `0`; otherwise, return the minimum length.

## Example Walkthrough

**Input:**
```text
target = 7
nums = [2, 3, 1, 2, 4, 3]
```

**Process:**

- Expand the window until its sum reaches or exceeds `7`.
- Shrink the window from the left while maintaining a valid sum.
- Continue expanding and shrinking to find the minimum possible length.

**Output:**
```text
2
```

**Explanation:** The subarray `[4, 3]` has a sum of `7` and a minimum length of `2`.

## Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Both pointers traverse the array at most once. |
| Space | O(1) | Only a constant number of variables are used. |

Although the solution contains a nested `while` loop, its overall time complexity is O(n) because each pointer moves forward at most n times.

## Key Concepts Learned

- Variable-Size Sliding Window
- Two-Pointer Technique
- Maintaining a Running Sum
- Expanding and Shrinking a Window
- Finding the Minimum Valid Subarray Length
- Amortized O(n) Time Complexity

## Important Observation

This sliding-window approach works because all array elements are positive integers.

Adding an element increases the window sum, while removing an element decreases it. This property allows us to efficiently expand and shrink the window.

## What I Learned

Today's problem helped strengthen my understanding of variable-size sliding windows.

The important insight was to keep shrinking the window whenever its sum satisfies the target condition, rather than stopping after finding the first valid window.

This ensures that the minimum-length subarray is found efficiently without checking every possible subarray.

---

**Day 43 Completed! 🚀**

Continuing the Java DSA journey, one problem at a time.