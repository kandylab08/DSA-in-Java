## Day 50 – Majority Element II

**Problem:** [Majority Element II – LeetCode 229] 
**Difficulty:** Medium  
**Topic:** Arrays, Boyer-Moore Voting Algorithm

### Problem Statement
Given an integer array `nums` of size `n`, return all elements that appear more than `⌊n/3⌋` times.

### Approach: Extended Boyer-Moore Voting Algorithm

Instead of using a HashMap to count the frequency of every element, we can solve this problem using the generalized Boyer-Moore Voting Algorithm.

**Key Observation:**

At most two elements can appear more than `n/3` times in an array.

Therefore, we only need to maintain two candidates and their respective vote counts.

### Algorithm

**Phase 1: Finding Potential Candidates**

1. Initialize two candidates (`c1`, `c2`) and their vote counts (`v1`, `v2`).
2. Traverse the array:
   - If the current element matches the first candidate, increment `v1`.
   - Otherwise, if it matches the second candidate, increment `v2`.
   - If the first candidate has zero votes, assign the current element to it.
   - Otherwise, if the second candidate has zero votes, assign the current element to it.
   - If neither candidate matches and both have non-zero votes, decrement both vote counts.
3. After traversal, the two candidates are potential majority elements.

**Phase 2: Verifying Candidates**

1. Traverse the array again.
2. Count the actual occurrences of both candidates.
3. Add a candidate to the result only if its frequency is greater than `n/3`.
4. Avoid adding duplicate candidates.

**Important:** The first phase only identifies potential candidates. Verification is necessary because the candidates are not guaranteed to satisfy the required frequency.

### Java Concepts Used

- Boyer-Moore Voting Algorithm
- Multiple candidate tracking
- Conditional statements
- Enhanced for loop
- Array traversal
- ArrayList for storing results

### Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Two complete traversals of the array |
| Space | O(1) | Only two candidates and their counters are maintained (excluding output storage) |

### Key Learnings

- Generalized Boyer-Moore Voting Algorithm can identify elements occurring more than `n/k` times.
- For the `n/3` condition, we need at most two candidates.
- Candidate selection and frequency verification are separate steps.
- Cancelling votes helps eliminate elements that cannot be guaranteed to be majority candidates.
- An optimal solution does not always require a HashMap.

### Day 50 Takeaway

Successfully implemented the extended Boyer-Moore Voting Algorithm with O(n) time complexity and O(1) auxiliary space.

**50 Days of Consistent Java DSA Practice Completed!** 🚀