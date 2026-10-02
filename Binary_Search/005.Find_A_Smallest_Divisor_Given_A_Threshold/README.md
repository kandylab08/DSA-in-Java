# Day 18: Find the Smallest Divisor Given a Threshold (LeetCode 1283)

## Problem
Given an array `nums` and an integer `threshold`, find the smallest positive divisor such that:

ceil(nums[0]/divisor) + ceil(nums[1]/divisor) + ... <= threshold

---

## Approach
This problem uses **Binary Search on Answer**.

- Minimum divisor = `1`
- Maximum divisor = `max(nums)`

For every candidate divisor:
- Calculate the sum of ceiling divisions.
- If the sum is within the threshold, try smaller divisors.
- Otherwise, search for larger divisors.

---

## Key Concepts Learned
- Binary Search on Answer
- Ceiling Division
- Search Space Optimization
- Validity Checking Function

---

## Ceiling Division Formula

```java
(a + b - 1) / b
```

Example:

```text
9 / 5 = 2
(9 + 5 - 1) / 5 = 13 / 5 = 2
```

---

## Time Complexity

```text
O(n × log(max(nums)))
```

## Space Complexity

```text
O(1)
```

---

## What I Learned
- Not every binary search is on an array.
- Binary search can be used on answer ranges.
- Valid/Invalid conditions help narrow the search space.
- Ceiling division is useful in many problems.