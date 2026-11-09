## Day 48 – Longest Subarray of 1's After Deleting One Element

**Problem:** [1493. Longest Subarray of 1's After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)

**Difficulty:** Medium

**Topic:** Arrays, Sliding Window, Two Pointers

### Problem Statement
Given a binary array `nums`, delete exactly one element from the array.

Return the length of the longest non-empty subarray containing only `1`s after deleting exactly one element.

### Approach: Variable-Size Sliding Window

Used a variable-size sliding window to maintain a window containing at most one zero.

The idea is to find the longest window with at most one zero. Since exactly one element must be deleted, the maximum valid subarray length is the window length minus one.

**Algorithm:**

1. Initialize `left = 0`, `zeroCount = 0`, and `maxLength = 0`.
2. Expand the window by moving `right` through the array.
3. If `nums[right] == 0`, increment `zeroCount`.
4. If `zeroCount` exceeds one, shrink the window from the left until it contains at most one zero.
5. Update the maximum length using `right - left`.
6. Return `maxLength`.

### Important Concept: Why `right - left`?

The current window length is:

`right - left + 1`

However, exactly one element must be deleted.

Therefore:

`Valid Length = Window Length - 1`

Simplifying:

`Valid Length = right - left`

This also handles arrays containing only ones because one element must still be deleted.

### Complexity Analysis

- **Time Complexity:** O(n) – Each element is visited at most twice, once by the right pointer and once by the left pointer.
- **Space Complexity:** O(1) – Only a constant number of variables are used.

### Key Learnings

- Practiced variable-size sliding window.
- Maintained a window with at most one zero.
- Used two pointers to efficiently expand and shrink the window.
- Learned how mandatory deletion can be incorporated directly into the window-length calculation.
- Simplified conditional logic into a single unified calculation.

### Pattern Recognition

**When to consider this pattern:**

When a problem asks for the longest or shortest contiguous subarray satisfying a condition, consider variable-size sliding window if the condition can be maintained efficiently while expanding and shrinking the window.

**Day 48 Status:** Completed ✅