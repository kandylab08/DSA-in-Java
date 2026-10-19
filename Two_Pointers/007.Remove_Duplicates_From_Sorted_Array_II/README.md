# Day 32 – Remove Duplicates from Sorted Array II

**Problem:** [LeetCode 80 – Remove Duplicates from Sorted Array II]
**Difficulty:** Medium  
**Language:** Java  
**Topic:** Arrays, Two Pointers

## Problem Description
Given an integer array `nums` sorted in non-decreasing order, remove some duplicates in-place so that each unique element appears at most twice.

The relative order of the elements must be maintained. Return `k`, the number of valid elements remaining in the array.

The first `k` elements of `nums` should contain the result. Extra elements beyond index `k - 1` can be ignored.

## Example

**Input:**
```text
nums = [1,1,1,2,2,3]
```

**Output:**
```text
k = 5
nums = [1,1,2,2,3,_]
```

## Approach
Used the two-pointer technique to modify the array in-place.

- `i` scans the input array.
- `k` tracks the position where the next valid element should be placed.
- Since the array is sorted, compare the current element with the element two positions behind the next write position.
- If `k < 2` or `nums[i] != nums[k - 2]`, keep the element and increment `k`.
- Otherwise, skip the element because two copies of that value have already been retained.

## Complexity Analysis
- **Time Complexity:** `O(n)` — Each element is processed once.
- **Space Complexity:** `O(1)` — The array is modified in-place using constant extra space.

## Concepts Learned
- Two-pointer technique
- In-place array modification
- Exploiting sorted-array properties
- Using previously processed elements to avoid an additional counter
- Improving conditional logic

## Key Takeaway
For sorted arrays, checking the element two positions behind the write pointer is enough to ensure that each value appears at most twice. This removes the need for a separate frequency counter.

## Reflection
This problem helped strengthen my understanding of two pointers and in-place array operations. I also learned that using the processed portion of an array can simplify logic and reduce unnecessary conditions.

**Day 32 completed! 🚀**
