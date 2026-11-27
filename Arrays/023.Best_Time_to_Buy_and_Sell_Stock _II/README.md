# Day 62 – Best Time to Buy and Sell Stock II

**Problem:** [Best Time to Buy and Sell Stock II – LeetCode 122]

**Difficulty:** Medium

**Language:** Java

## Approach: Greedy

- Observed that every positive price difference between consecutive days contributes to the maximum possible profit.
- Iterated through the prices starting from index 1.
- If the current day's price is greater than the previous day's price, added the difference to the total profit.
- Ignored negative and zero price differences because they don't contribute to profit.
- This works because multiple transactions are allowed, provided only one stock is held at a time.

## Complexity Analysis

- **Time Complexity:** O(n) – Traverses the array once.
- **Space Complexity:** O(1) – Uses only a constant amount of extra space.

## Key Learnings

- Understood how to identify greedy choices through manual observation.
- Used a graph to visualize stock price movements.
- Discovered that summing all positive consecutive differences gives the maximum profit when multiple transactions are allowed.
- Understood the difference between LeetCode 121 (one transaction) and LeetCode 122 (multiple transactions).

**Day 62 completed!** 🚀