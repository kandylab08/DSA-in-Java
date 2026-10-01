# 📦 Capacity To Ship Packages Within D Days

**LeetCode 1011 — Medium**

## 🧩 Problem

Given an array `weights`, where `weights[i]` represents the weight of the `i`th package, and an integer `days`, find the **minimum ship capacity** required to ship all packages within the given number of days.

Packages must be shipped **in the same order as they appear in the array**.

---

## 💡 Key Idea

This problem can be solved using **Binary Search on Answer**.

Instead of searching for an element, we binary search for the **minimum possible ship capacity**.

### Search Range

- **Minimum capacity:** The heaviest package in the array.
- **Maximum capacity:** The total weight of all packages.

For every possible capacity, we check whether all packages can be shipped within the given number of days.

If a capacity works, we try a smaller capacity.

If it does not work, we need a larger capacity.

---

## 🔍 Feasibility Check

For a chosen capacity:

1. Start with the first day.
2. Keep adding packages to the current day.
3. If adding the next package exceeds the capacity:
   - Start a new day.
   - Put that package on the new day.
4. If the number of required days becomes greater than `days`, the capacity is not sufficient.

---

## ⏱️ Complexity

- **Time:** `O(n log(sum(weights)))`
- **Space:** `O(1)`

---

## 🧠 Concepts Learned

- Binary Search on Answer
- Greedy simulation
- Feasibility checking
- Search-space boundaries
- Monotonic conditions
- Early termination

---

## 📌 Pattern

This problem follows the pattern:

```text
Find the minimum X such that canDo(X) is true.
```

Binary search:

```java
if (canDo(mid))
    high = mid - 1;
else
    low = mid + 1;
```

This is the same core pattern used in problems such as **Koko Eating Bananas**.

---

## 📅 Day 17

**Problem:** Capacity To Ship Packages Within D Days  
**LeetCode:** #1011  
**Difficulty:** Medium  
**Topic:** Binary Search on Answer