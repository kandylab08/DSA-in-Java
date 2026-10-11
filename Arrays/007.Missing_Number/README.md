# Day 27 – Missing Number

## Problem
**LeetCode 268: Missing Number**

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

## Approaches

### 1. Presence Array

**Idea:** Create an auxiliary array of size `n + 1` and mark each number present in the input array. The index that remains unmarked is the missing number.

**Complexity Analysis**
- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

### 2. Mathematical Sum (Optimized)

**Idea:** Calculate the expected sum of all numbers from `0` to `n` using the formula:

`Expected Sum = n * (n + 1) / 2`

Calculate the actual sum of the array and subtract it from the expected sum. The difference gives the missing number.

**Complexity Analysis**
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

**Optimization:** Reduced auxiliary space from `O(n)` to `O(1)` by eliminating the extra array.

## Key Learnings
- Used an auxiliary array to track the presence of elements.
- Applied the mathematical sum formula to identify a missing number.
- Improved space complexity without changing time complexity.
- Practiced comparing multiple solutions to the same problem.
