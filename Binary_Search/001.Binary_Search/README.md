# Day 15 — Binary Search

## Problem

**LeetCode #704 — Binary Search**

Given a sorted integer array `nums` and an integer `target`, return the index of `target`. If `target` does not exist in the array, return `-1`.

## Solution

The array is sorted, so instead of checking every element, binary search is used to repeatedly divide the search space in half.

Two pointers are maintained:

* `low` — beginning of the search range
* `high` — end of the search range

The middle element is calculated as:

```java
int mid = low + (high - low) / 2;
```

If `nums[mid]` is:

* Equal to `target` → return `mid`
* Greater than `target` → search the left half
* Less than `target` → search the right half

The process continues until the target is found or the search range becomes empty.

## Complexity

* **Time:** `O(log n)`
* **Space:** `O(1)`

## Concepts Learned

* Binary Search
* Sorted array searching
* Maintaining `low`, `mid`, and `high`
* Reducing the search space by half
* Safe calculation of the middle index

## Key Learning

Binary search works by maintaining the invariant that if the target exists, it must be within the current `[low, high]` range.

Instead of checking every element, half of the remaining elements can be eliminated after every comparison.
