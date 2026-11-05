# Day 44 – Sort Colors

**LeetCode Problem:** [75. Sort Colors](https://leetcode.com/problems/sort-colors/)  
**Difficulty:** Medium  
**Topic:** Arrays, Three Pointers, Dutch National Flag Algorithm

## Problem Statement

Given an integer array `nums` containing only `0`, `1`, and `2`, sort the array in-place so that all elements of the same value are adjacent and appear in the order `0`, `1`, and `2`.

You must solve this problem without using the library sorting function.

### Example 1

**Input:**
```text
nums = [2,0,2,1,1,0]
```

**Output:**
```text
[0,0,1,1,2,2]
```

### Example 2

**Input:**
```text
nums = [2,0,1]
```

**Output:**
```text
[0,1,2]
```

## Approach – Dutch National Flag Algorithm

Used the **Dutch National Flag Algorithm**, which efficiently sorts an array containing three distinct values using three pointers.

Instead of sorting the array or creating another array, the elements are rearranged in-place.

### Three Pointers

1. **zeroes:** Maintains the position where the next `0` should be placed.
2. **ones:** Points to the current element being examined.
3. **twos:** Maintains the position where the next `2` should be placed.

### Algorithm

Initialize:
- `zeroes = 0`
- `ones = 0`
- `twos = nums.length - 1`

Continue while `ones <= twos`.

**Case 1: Current element is 0**
- Swap `nums[zeroes]` and `nums[ones]`.
- Increment both `zeroes` and `ones`.

**Case 2: Current element is 1**
- Increment `ones`.
- No swapping is required because `1` belongs in the middle region.

**Case 3: Current element is 2**
- Swap `nums[ones]` and `nums[twos]`.
- Decrement `twos`.
- Do not increment `ones`, because the newly swapped element has not been examined yet.

## Dry Run

**Input:**
```text
[2,0,2,1,1,0]
```

| Step | Array | Operation |
|---|---|---|
| 1 | [0,0,2,1,1,2] | Swap 2 with rightmost element |
| 2 | [0,0,2,1,1,2] | Move past 0 |
| 3 | [0,0,2,1,1,2] | Move past 0 |
| 4 | [0,0,1,1,2,2] | Swap 2 with 1 |
| 5 | [0,0,1,1,2,2] | Move past 1 |
| 6 | [0,0,1,1,2,2] | Move past 1 |

**Final Output:**
```text
[0,0,1,1,2,2]
```

## Complexity Analysis

- **Time Complexity: O(n)** – Each element is processed a constant number of times.
- **Space Complexity: O(1)** – Sorting is performed in-place using only three pointers and a temporary variable.

## Key Learnings

- Understanding the Dutch National Flag Algorithm.
- Using three pointers to partition an array into three regions.
- Performing in-place array manipulation.
- Understanding why the middle pointer must not advance after swapping with the right pointer.
- Achieving linear time complexity with constant auxiliary space.

## Takeaway

The Dutch National Flag Algorithm is an efficient technique for partitioning an array containing three distinct values. It demonstrates how multiple pointers can solve array problems without requiring extra memory.

**Day 44 Completed!** 🚀