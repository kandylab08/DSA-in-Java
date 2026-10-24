# 🟢 Day 35 — Find Pivot Index

**LeetCode:** 724 — Find Pivot Index  
**Difficulty:** Easy  
**Category:** Arrays / Prefix Sum

## 🧩 Problem

Given an integer array `nums`, find the **pivot index** where the sum of all elements strictly to the left equals the sum of all elements strictly to the right.

- If the pivot is at index `0`, the left sum is `0`.
- If the pivot is at the last index, the right sum is `0`.
- Return the **leftmost pivot index**, or `-1` if no pivot exists.

### Example

**Input:**
```text
nums = [1, 7, 3, 6, 5, 6]
```

**Output:**
```text
3
```

**Explanation:**

Left sum = `1 + 7 + 3 = 11`  
Right sum = `5 + 6 = 11`

Both sums are equal at index `3`.

## 💡 Approach

First, calculate the total sum of the array. Then traverse the array while maintaining a running `leftSum`.

At each index, calculate the right sum using:

```java
rightSum = totalSum - nums[i] - leftSum;
```

If `leftSum == rightSum`, return the current index immediately. Otherwise, add the current element to `leftSum` and continue.

This avoids creating separate prefix-sum and suffix-sum arrays.

## 🔑 Algorithm

1. Calculate the total sum of all array elements.
2. Initialize `leftSum = 0`.
3. Traverse the array from left to right.
4. Calculate `rightSum = totalSum - nums[i] - leftSum`.
5. If `leftSum == rightSum`, return `i`.
6. Otherwise, add `nums[i]` to `leftSum`.
7. If no pivot is found, return `-1`.

## ⏱️ Complexity

- **Time Complexity:** `O(n)` — Two linear traversals of the array.
- **Auxiliary Space Complexity:** `O(1)` — Only a constant number of variables are used.

## 🧠 What I Learned

- Understanding prefix sums and suffix sums.
- Calculating the right-side sum using the total sum.
- Optimizing auxiliary space from `O(n)` to `O(1)`.
- Finding the leftmost valid index by traversing from left to right.
- Maintaining a running sum to avoid repeated calculations.

## 🏆 Day 35 Status

- Solved Find Pivot Index.
- Optimized the solution to `O(1)` auxiliary space.
- Analyzed time and space complexity.
- Practiced array traversal and running sums.

**Key Takeaway:** The total sum of an array can be used to calculate the right-side sum at any index without storing separate prefix-sum or suffix-sum arrays.

**Consistency over perfection — one problem at a time!** 🚀