# Day 59 – Maximum Points You Can Obtain from Cards

**LeetCode:** [1423. Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)  
**Difficulty:** Medium  
**Language:** Java

### Problem

Given an array `cardPoints` and an integer `k`, select exactly `k` cards from either the beginning or the end of the array to maximize the total score.

### Approach

- Initially calculate the sum of the last `k` elements (taking all cards from the right).
- Maintain the current score while progressively replacing cards from the right with cards from the left.
- At each step, add the next card from the left and subtract the corresponding card from the right.
- Update the maximum score after every exchange.

This allows us to explore all possible combinations without recalculating the entire sum.

### Complexity Analysis

- **Time Complexity:** O(k), which is O(n) in the worst case.
- **Space Complexity:** O(1), as no additional data structures are used.

### Key Learnings

- Explored all possible combinations of picking cards from both ends.
- Learned how to maintain and update a running sum instead of recalculating it.
- Recognized an incremental sliding-window pattern through independent problem analysis.
- Understood how to transform a problem involving choices from opposite ends into an efficient iterative solution.

### Reflection

Initially, I approached the problem without assuming any particular algorithm or pattern. While manually exploring the possible selections, I realized that calculating the sum of all `k` elements from one side and progressively exchanging elements from the opposite side would allow me to explore every valid combination.

The best part was deriving the optimized solution independently through observation rather than starting with a predefined algorithm.

**Day 59 completed! 🚀**
