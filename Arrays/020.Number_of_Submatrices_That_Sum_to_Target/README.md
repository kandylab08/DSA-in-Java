# Day 57 – Number of Submatrices That Sum to Target

**Problem:** [LeetCode 1074 – Number of Submatrices That Sum to Target]

**Difficulty:** Medium

**Language:** Java

## Approach: 2D Prefix Sum + HashMap

### 1. Build Row-wise Prefix Sums

- Create a 2D prefix sum array of size `(m + 1) × (n + 1)`.
- Calculate horizontal prefix sums for every row.
- This allows us to efficiently find the sum between any two column boundaries in a row.

### 2. Fix Two Column Boundaries

- Use two nested loops to select the left (`c1`) and right (`c2`) column boundaries.
- For every pair of columns, calculate the sum of elements between them for each row.
- This effectively converts the 2D matrix problem into a 1D subarray sum problem.

### 3. Apply Prefix Sum + HashMap

- Maintain a running prefix sum (`curSum`) while traversing the rows.
- Use a HashMap to store the frequency of previously encountered prefix sums.
- For every current prefix sum, look for `curSum - target` in the HashMap.
- The frequency represents the number of valid subarrays ending at the current row.
- Initialize the HashMap with `map.put(0, 1)` to handle subarrays starting from the first row.

## Complexity Analysis

- **Time Complexity:** `O(m × n²)` – Iterate through all pairs of columns and process each row.
- **Space Complexity:** `O(m × n)` – For the 2D prefix sum array, with an additional `O(m)` space for the HashMap.

## Key Concepts Learned

- 2D Prefix Sum
- Row-wise Prefix Sum
- Submatrix Sum Calculation
- Prefix Sum + HashMap
- Frequency Counting
- Reducing a 2D Problem to a 1D Problem

## Learning Outcome

Learned how to optimize submatrix sum calculations by fixing two column boundaries and reducing the problem to a one-dimensional subarray sum problem using prefix sums and HashMap frequency counting.

**Day 57 of my Java DSA journey completed!** 🚀