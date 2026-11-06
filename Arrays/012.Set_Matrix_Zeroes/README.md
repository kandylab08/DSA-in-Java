# Day 45 – Set Matrix Zeroes

**LeetCode:** [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)  
**Difficulty:** Medium  
**Topic:** Arrays, Matrix, HashSet, In-place Algorithms

## Problem Statement

Given an `m × n` integer matrix, if an element is `0`, set its entire row and column to `0`.

The modification must be performed in place.

## Approach 1: Using HashSets

### Intuition

We need to identify all rows and columns containing zeroes before modifying the matrix.

We use two HashSets:
- `rowSet`: Stores indices of rows containing at least one zero.
- `colSet`: Stores indices of columns containing at least one zero.

### Algorithm

1. Traverse the entire matrix.
2. Whenever a zero is encountered, store its row index in `rowSet` and column index in `colSet`.
3. Traverse the matrix again.
4. If the current row or column exists in its respective HashSet, set that element to zero.

### Complexity Analysis

- **Time Complexity:** O(m × n) – Two complete matrix traversals.
- **Space Complexity:** O(m + n) – HashSets store the affected row and column indices.

---

## Approach 2: In-place Marking (Optimal)

### Intuition

Instead of using additional HashSets, we can use the first row and first column of the matrix itself to store markers.

- `matrix[i][0]` indicates whether row `i` should become zero.
- `matrix[0][j]` indicates whether column `j` should become zero.
- `matrix[0][0]` acts as the marker for the first row.
- A separate boolean variable tracks whether the first column originally contains zero.

This allows us to achieve O(1) auxiliary space.

### Algorithm

1. Initialize `firstColZero` to false.
2. Traverse the matrix and identify zeroes.
3. If an element is zero:
   - Mark its corresponding row using `matrix[i][0] = 0`.
   - Mark its corresponding column using `matrix[0][j] = 0`.
4. Traverse the inner matrix, excluding the first row and first column.
5. If either the corresponding row marker or column marker is zero, set the current element to zero.
6. If `matrix[0][0] == 0`, make the entire first row zero.
7. If `firstColZero` is true, make the entire first column zero.

### Complexity Analysis

- **Time Complexity:** O(m × n) – The matrix is traversed a constant number of times.
- **Space Complexity:** O(1) – Only one boolean variable is used; the matrix itself stores the markers.

---

## Important Concepts Learned

- Two-dimensional array traversal.
- HashSet for storing unique row and column indices.
- In-place matrix modification.
- Using existing array elements as markers.
- Optimizing auxiliary space from O(m + n) to O(1).
- Handling the first row and first column separately.
- Avoiding incorrect modifications during traversal.

## Key Takeaway

The HashSet approach is straightforward and easy to understand, but the in-place marking approach is more space-efficient.

The most important insight is that we can reuse the first row and first column as marker storage instead of allocating additional data structures.

**Day 45 completed!** 🚀