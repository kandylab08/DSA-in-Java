# Day 39 – Max Consecutive Ones III

**LeetCode Problem:** [1004. Max Consecutive Ones III]
**Difficulty:** Medium  
**Language:** Java  
**Topic:** Sliding Window, Two Pointers

## Problem Statement
Given a binary array `nums` and an integer `k`, return the maximum number of consecutive ones in the array if you can flip at most `k` zeros.

## Approach: Variable-Size Sliding Window
- Use two pointers, `left` and `right`, to maintain a sliding window.
- Expand the window by moving `right` and count the zeros.
- If the number of zeros exceeds `k`, shrink the window from the left until it becomes valid.
- Calculate the current window length using `right - left + 1`.
- Update the maximum length whenever a longer valid window is found.

## Complexity Analysis
- **Time Complexity:** O(n) — Each element is visited at most a constant number of times.
- **Space Complexity:** O(1) — Only a few variables are used.

## Key Learnings
- Understood how variable-size sliding windows differ from fixed-size windows.
- Learned to maintain a valid window using a constraint.
- Practiced shrinking the window only when the zero count exceeds `k`.
- Improved problem-solving skills using the two-pointer technique.

## Status
✅ Solved and optimized in Java.
