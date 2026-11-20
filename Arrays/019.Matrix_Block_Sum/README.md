# Day 56 – Matrix Block Sum (LeetCode 1314)

## Problem
Given an `m x n` matrix and an integer `k`, calculate the sum of all elements within a `k`-radius block around every cell and return the resulting matrix.

## Approach: 2D Prefix Sum

- Created a 2D prefix sum matrix of size `(m + 1) x (n + 1)` to simplify boundary handling.
- Built the prefix sum matrix using the current element, the sum above, and the sum to the left, subtracting the overlapping region.
- For every cell, calculated the block boundaries using `Math.min()` and `Math.max()` to handle matrix boundaries.
- Used the rectangle sum formula to calculate each block sum in O(1) time.

### 2D Prefix Sum Formula

```java
matSum[i][j] = mat[i - 1][j - 1]
             + matSum[i - 1][j]
             + matSum[i][j - 1]
             - matSum[i - 1][j - 1];
```

### Rectangle Sum Formula

```java
sum = matSum[r1][c1]
    - matSum[r2][c1]
    - matSum[r1][c2]
    + matSum[r2][c2];
```

## Complexity Analysis

- **Time Complexity:** O(m × n) – Building the prefix matrix and calculating all block sums.
- **Space Complexity:** O(m × n) – For the prefix sum matrix and result matrix.

## Key Concepts Learned

- 2D Prefix Sum
- Matrix Traversal
- Submatrix Range Sum Queries
- Inclusion-Exclusion Principle
- Boundary Handling

## Key Takeaway

Learned how to extend the 1D Prefix Sum technique to two dimensions. By using the inclusion-exclusion principle, rectangular submatrix sums can be calculated in constant time after preprocessing.

**Day 56 completed! 🚀**