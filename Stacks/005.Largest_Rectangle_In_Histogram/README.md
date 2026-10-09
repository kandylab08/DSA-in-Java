# Day 25 – Largest Rectangle in Histogram

**LeetCode Problem:** [84. Largest Rectangle in Histogram]
**Difficulty:** Hard  
**Language:** Java  
**Topic:** Monotonic Stack, Arrays

## Problem Statement
Given an array of integers `heights` representing the heights of histogram bars, where each bar has a width of `1`, return the largest rectangular area that can be formed within the histogram.

## Approach
- Use a monotonic increasing stack to store the indices of histogram bars.
- Iterate through the array and pop indices whenever the current bar is shorter than the bar at the top of the stack.
- For each popped bar, calculate the rectangle's height and width.
- Update the maximum area using `height * width`.
- Process one additional iteration at the end to calculate areas for all remaining bars.

## Complexity Analysis
- **Time Complexity:** O(n) — Each index is pushed onto and popped from the stack at most once.
- **Space Complexity:** O(n) — The stack can store up to n indices.

## Key Learnings
- Applying a monotonic stack to solve histogram problems efficiently.
- Finding the maximum rectangle by determining how far each bar can extend.
- Calculating rectangle width using the current index and the previous smaller bar's index.
- Handling remaining stack elements with an additional iteration.
