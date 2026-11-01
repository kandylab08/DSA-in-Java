# Day 41 – Fruit Into Baskets

**LeetCode:** 904 – Fruit Into Baskets  
**Difficulty:** Medium  
**Topic:** Sliding Window, Two Pointers, Frequency Counting

## Problem
Given an integer array `fruits`, find the maximum number of fruits that can be collected from consecutive trees, with the restriction that only two distinct fruit types can be collected.

## Approach 1 – Last Seen Index Tracking

- Maintain two fruit types (`f1`, `f2`).
- Track their most recent occurrence using `last1` and `last2`.
- When a third fruit type appears, identify the fruit whose last occurrence is earlier.
- Move the left pointer past that occurrence and replace the corresponding fruit type.

## Approach 2 – Frequency-Based Sliding Window

- Maintain two fruit types and their frequencies using a fixed-size array.
- Expand the window while the fruit belongs to either existing type.
- When a third type appears, shrink the window until one fruit type has a frequency of zero.
- Replace the empty bucket with the new fruit type.

## Complexity Analysis

| Complexity | Approach 1 | Approach 2 |
|---|---|---|
| Time | O(n) | O(n) |
| Space | O(1) | O(1) |

## Key Concepts Learned
- Variable-size Sliding Window
- Two Pointers
- Frequency Tracking
- Last Occurrence Index
- Maintaining at Most Two Distinct Elements

## Learning Outcome
Explored two different O(n) sliding window techniques to solve the same problem: tracking the last occurrence of elements and maintaining element frequencies.

Both approaches achieve optimal time and constant auxiliary space complexity.