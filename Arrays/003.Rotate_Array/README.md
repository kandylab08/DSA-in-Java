# 🟢 Day 8 — Rotate Array

**LeetCode #189 — Rotate Array**

## 📌 Problem

Given an integer array `nums`, rotate the array to the right by `k` steps.

Each step moves the last element of the array to the front.

### Example

```text
Input:  nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
```

---

## 💡 Solution

The array can be rotated efficiently using the **Three-Reversal Technique**.

### Steps

1. Calculate `k % nums.length` to avoid unnecessary rotations.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining elements.

### Example

```text
Original:
[1,2,3,4,5,6,7]

Reverse entire array:
[7,6,5,4,3,2,1]

Reverse first 3 elements:
[5,6,7,4,3,2,1]

Reverse remaining elements:
[5,6,7,1,2,3,4]
```

---

## 🧠 Concepts Learned

* Array rotation
* In-place array manipulation
* Three-reversal technique
* Two-pointer technique
* Modulo operation
* Helper methods in Java
* Reducing unnecessary operations using `k % n`

---

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

The array is modified **in-place**, so no additional array is required.

---

## 🔑 Key Takeaway

An array rotation that initially looks like it requires shifting elements repeatedly can be solved efficiently using **three reversals**.

The important pattern is:

```text
Reverse everything
→ Reverse first k elements
→ Reverse remaining elements
```

This gives an **O(n) time and O(1) space** solution.
