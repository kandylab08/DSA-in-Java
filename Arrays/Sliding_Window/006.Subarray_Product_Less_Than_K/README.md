# Day 47 – Subarray Product Less Than K

**Problem:** [713. Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/)

**Difficulty:** Medium

**Topic:** Arrays, Sliding Window, Two Pointers

## Problem Statement

Given an array of positive integers `nums` and an integer `k`, return the number of contiguous subarrays where the product of all elements in the subarray is strictly less than `k`.

### Example 1

**Input:**
```java
nums = [10, 5, 2, 6], k = 100
```

**Output:**
```java
8
```

**Explanation:**

The valid subarrays are:

```text
[10], [5], [2], [6]
[10, 5], [5, 2], [2, 6]
[5, 2, 6]
```

Total = 8 valid subarrays.

### Example 2

**Input:**
```java
nums = [1, 2, 3], k = 0
```

**Output:**
```java
0
```

## Approach – Sliding Window

We use the **Variable Size Sliding Window** technique to efficiently count valid contiguous subarrays.

Instead of generating every possible subarray and calculating its product, we maintain a window whose product is always strictly less than `k`.

### Algorithm

1. If `k <= 1`, return `0` because all array elements are positive integers.
2. Initialize two pointers:
   - `left = 0` – starting position of the window.
   - `right` – ending position of the window.
3. Maintain a running product using `curPrdt`.
4. Expand the window by multiplying the current element into `curPrdt`.
5. If the product becomes greater than or equal to `k`, shrink the window from the left until it becomes valid.
6. Once the window is valid, calculate the number of valid subarrays ending at the current `right` position using:

   `right - left + 1`

7. Add this value to the total count.

### Why Does `right - left + 1` Work?

This is the key observation behind the problem.

Suppose the current valid window is:

```text
[5, 2, 6]
```

Here:
- `left = 1`
- `right = 3`

The valid subarrays ending at the current right pointer are:

```text
[6]
[2, 6]
[5, 2, 6]
```

Since all elements are positive integers, removing elements from the beginning of a valid window cannot increase its product.

Therefore, every subarray starting between `left` and `right` and ending at `right` is also valid.

The total number of such subarrays is:

```java
right - left + 1
```

This allows us to count multiple subarrays in constant time without checking each one individually.

## Dry Run

**Input:**
```java
nums = [10, 5, 2, 6]
k = 100
```

| Right | Current Window | Product | New Subarrays | Count |
|---|---|---:|---:|---:|
| 0 | [10] | 10 | 1 | 1 |
| 1 | [5] | 5 | 2 | 3 |
| 2 | [5, 2] | 10 | 2 | 5 |
| 3 | [5, 2, 6] | 60 | 3 | 8 |

At `right = 1`, the window initially becomes `[10, 5]`, with product 50. Since it is valid, there are two valid subarrays ending at this position: `[5]` and `[10, 5]`.

At `right = 3`, the window is `[5, 2, 6]`, giving three valid subarrays.

**Final Output:**
```java
8
```

## Complexity Analysis

**Time Complexity: O(n)**

Each element enters the sliding window once and leaves the window at most once.

Therefore, the total number of pointer movements is linear.

**Space Complexity: O(1)**

Only a fixed number of variables are used, regardless of the input size.

## Key Concepts Learned

- Variable Size Sliding Window.
- Two Pointers Technique.
- Maintaining a running product.
- Shrinking a window when a condition becomes invalid.
- Counting multiple valid subarrays efficiently.
- Understanding the `right - left + 1` counting formula.
- Handling edge cases such as `k <= 1`.

## Mistakes and Learnings

1. Initially, I counted individual elements and subarrays separately, which caused duplicate counting.
2. I initially missed the current element while calculating the number of valid subarrays.
3. I learned that `right - left + 1` counts all valid subarrays ending at the current right pointer.
4. I removed unnecessary special handling of the first element by initializing the running product to `1`.
5. I used `long` for the running product to provide additional safety against integer overflow.

## Takeaway

The biggest learning from this problem was understanding how a single valid sliding window can represent multiple valid subarrays.

Instead of checking every possible subarray individually, we can count them using a simple mathematical observation.

**Pattern: Variable Size Sliding Window + Subarray Counting**

---

**Day 47 Completed!** 🚀