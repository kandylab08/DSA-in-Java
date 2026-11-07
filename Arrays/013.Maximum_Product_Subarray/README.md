# Day 46 – Maximum Product Subarray

**Problem:** [LeetCode 152 – Maximum Product Subarray]

**Difficulty:** Medium  
**Topic:** Arrays, Dynamic Programming  
**Language:** Java

## Problem Statement

Given an integer array `nums`, find a contiguous, non-empty subarray that has the largest product and return that product.

A subarray is a contiguous sequence of elements within an array.

### Examples

**Example 1:**
```text
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product.
```

**Example 2:**
```text
Input: nums = [-2,0,-1]
Output: 0
Explanation: [0] has the largest product.
```

**Example 3:**
```text
Input: nums = [-2,3,-4]
Output: 24
Explanation: [-2,3,-4] has the largest product.
```

## Approach: Dynamic Programming (Maximum and Minimum Product)

The main challenge is handling negative numbers.

Unlike the Maximum Subarray Sum problem, multiplying two negative numbers produces a positive number. Therefore, the minimum product calculated so far can become the maximum product after multiplying by another negative number.

To handle this, maintain three variables:

- `maxSoFar`: Maximum product of a subarray ending at the current index.
- `minSoFar`: Minimum product of a subarray ending at the current index.
- `result`: Maximum product found across all subarrays.

### Algorithm

1. Initialize `maxSoFar`, `minSoFar`, and `result` with the first array element.
2. Traverse the array starting from index 1.
3. Store the current element in `curr`.
4. If `curr` is negative, swap `maxSoFar` and `minSoFar`.
5. Update `maxSoFar` by choosing between:
   - Starting a new subarray with `curr`.
   - Extending the previous maximum product by multiplying it with `curr`.
6. Update `minSoFar` similarly, choosing the smaller product.
7. Update `result` with the maximum product found so far.
8. Return `result`.

## Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Traverses the array once. |
| Space | O(1) | Uses only a constant number of variables. |

## Key Learnings

- Understood why tracking only the maximum product is insufficient when negative numbers are present.
- Learned to maintain both maximum and minimum products at every index.
- Understood how multiplying by a negative number swaps the roles of maximum and minimum products.
- Applied Dynamic Programming with constant auxiliary space.
- Learned how zeros are handled naturally by restarting the subarray when necessary.

## Mistakes & Improvements

**Initial approach:**
- Tried splitting the array into segments using zeros.
- Attempted to remove elements from either end when the total product was negative.
- The removal strategy did not reliably identify the maximum-product subarray.
- Failed to handle arrays containing only negative numbers correctly.

**Improved approach:**
- Replaced the complicated segment-based logic with maximum and minimum product tracking.
- Used a simple swap when encountering a negative number.
- Achieved an optimal O(n) time and O(1) space solution.

## Day 46 Summary

Successfully solved LeetCode 152 using Dynamic Programming.

**Key concept:** A minimum product can become a maximum product when multiplied by a negative number.

**Status:** Completed ✅

---

*Consistency over perfection. One problem at a time!* 🚀