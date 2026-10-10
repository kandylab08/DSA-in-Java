# Day 26 — Baseball Game

**Problem:** [Baseball Game — LeetCode 682] 
**Difficulty:** Easy  
**Topic:** Stack, Simulation  
**Language:** Java

## Problem Description
Given a list of operations representing baseball game scores, calculate the total score after processing all operations.

Each operation can be:
- An integer: Record a new score.
- `+`: Record the sum of the previous two valid scores.
- `D`: Record double the previous valid score.
- `C`: Cancel the previous valid score.

## Approach
- Used a `Stack<Integer>` to maintain the valid scores.
- Used a `switch` statement to handle each operation.
- For `+`, temporarily removed the latest score, added it to the second-last score, restored the latest score, and pushed the new sum.
- For `D`, doubled the latest score and pushed the result.
- For `C`, removed the latest score.
- Parsed numeric strings using `Integer.parseInt()`.
- Summed all remaining valid scores to calculate the final result.

## Complexity Analysis
- **Time Complexity:** O(n), where n is the number of operations.
- **Space Complexity:** O(n), for storing valid scores in the stack.

## Concepts Learned
- Java Stack operations: `push()`, `pop()`, and `peek()`.
- Using `switch` for operation-based logic.
- Simulating a problem using a stack.
- Preserving previous scores while calculating new ones.

## Key Takeaway
A stack is useful when a problem requires tracking recent values and modifying or removing the most recent entry based on incoming operations.

**Status:** Solved ✅