# 🟢 Day 12 — Container With Most Water

**LeetCode #11 — Container With Most Water**

## 📌 Problem

Given an integer array `height`, where `height[i]` represents the height of a vertical line at index `i`, find two lines that together with the x-axis form a container that can hold the maximum amount of water.

Return the maximum amount of water the container can store.

### Example

```text
Input:  height = [1,8,6,2,5,4,8,3,7]
Output: 49
```

## 💡 Solution

Used the **Two Pointer** technique.

* Start with one pointer at the beginning and another at the end.
* Calculate the area between the two pointers.
* The area is determined by:

```text
Area = Width × Minimum Height
```

* Move the pointer pointing to the shorter line, because the shorter line limits the amount of water.
* Continue until the two pointers meet.

## 🧠 Concepts Learned

* Two Pointer technique
* Greedy pointer movement
* Calculating area using array values
* `Math.min()`
* `Math.max()`
* Understanding why the smaller-height pointer should move

## ⏱️ Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

## 📝 Key Learning

The important idea is that moving the pointer with the **smaller height** gives us a chance to find a taller boundary while the width decreases.

Moving the taller pointer cannot improve the result while the shorter boundary remains unchanged.

---

### ✅ Status

**Completed — Day 12**