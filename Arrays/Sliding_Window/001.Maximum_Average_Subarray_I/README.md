# Day 36 — Maximum Average Subarray I

**LeetCode:** [643. Maximum Average Subarray I]
**Difficulty:** Easy  
**Topics:** Arrays, Sliding Window

## Problem
Given an integer array `nums` and an integer `k`, find the contiguous subarray of length exactly `k` with the maximum average and return that average.

## Example
**Input:** `nums = [1,12,-5,-6,50,3], k = 4`  
**Output:** `12.75`

**Explanation:** The subarray `[12,-5,-6,50]` has the maximum sum of `51`, giving an average of `51 / 4 = 12.75`.

## Solution
Used a fixed-size sliding window to calculate the sum of the first `k` elements. Then, moved the window one position at a time by adding the incoming element and subtracting the outgoing element.

Tracked the maximum window sum and divided it by `k` at the end.

## Complexity Analysis
- **Time Complexity:** `O(n)` — each element is processed a constant number of times.
- **Space Complexity:** `O(1)` — only a fixed number of variables are used.

## Key Learnings
- Practiced the fixed-size sliding window technique.
- Avoided recalculating the sum for every subarray.
- Learned to track the maximum sum before calculating the average.
- Used `(double) maxSum / k` to preserve decimal precision and avoid integer division.

## Mistake Corrected
Initially, the average was calculated using integer division, which discarded the decimal portion. Corrected this by maintaining the maximum window sum as an integer and converting it to `double` only when returning the average.

## Takeaway
A fixed-size sliding window reduces repeated calculations and solves this problem in linear time with constant extra space.