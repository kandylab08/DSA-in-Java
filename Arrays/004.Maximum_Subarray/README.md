# 🟡 Day 9 — Maximum Subarray

**LeetCode #53 — Maximum Subarray**

## 📌 Problem

Given an integer array `nums`, find the subarray with the largest sum and return its sum.

A **subarray** is a contiguous part of the array.

### Example

```text
Input:  [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
```

The subarray `[4,-1,2,1]` has the maximum sum:

```text
4 + (-1) + 2 + 1 = 6
```

---

## 💡 Solution

Used **Kadane's Algorithm**.

The idea is to maintain:

* `curSum` → maximum sum of a subarray ending at the current position
* `maxSum` → maximum subarray sum found so far

If `curSum` becomes negative, it is better to discard it and start a new subarray from the next element.

---

## 🧠 Concepts Learned

* Kadane's Algorithm
* Dynamic Programming
* Maintaining running state
* Maximum subarray problems
* Deciding when to restart a subarray
* Handling arrays containing only negative numbers

---

## ⏱️ Complexity

* **Time:** `O(n)`
* **Space:** `O(1)`

The array is traversed only once and no additional data structure is required.

---

## 🔍 Key Learning

The important idea behind this problem is:

> If the current subarray sum becomes negative, carrying it forward will only decrease the sum of any future subarray, so we discard it and start fresh.

This helped me understand how a problem can be solved by maintaining a small amount of useful information while traversing an array.

---

## 📚 Pattern

**Kadane's Algorithm / Dynamic Programming**

This pattern can be useful for problems involving maximum or minimum sums of contiguous subarrays.
