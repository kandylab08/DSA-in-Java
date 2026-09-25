# 🟢 Day 11 — 3Sum

**LeetCode #15 — 3Sum**

## 📌 Problem

Given an integer array `nums`, return all the unique triplets `[nums[i], nums[j], nums[k]]` such that:

```text
nums[i] + nums[j] + nums[k] == 0
```

The solution must not contain duplicate triplets.

### Example

```text
Input:
[-1, 0, 1, 2, -1, -4]

Output:
[[-1, -1, 2], [-1, 0, 1]]
```

---

## 💡 Solution

The array is first sorted so that the **two-pointer technique** can be used efficiently.

For every element:

* Set `left` to the next position.
* Set `right` to the last position.
* Calculate the sum of the three elements.
* If the sum is `0`, store the triplet.
* If the sum is less than `0`, move `left` forward.
* If the sum is greater than `0`, move `right` backward.
* Skip duplicate values to avoid duplicate triplets.

---

## 🧠 Concepts Learned

* Sorting
* Two Pointer Technique
* Duplicate Handling
* Array Traversal
* `Arrays.sort()`
* `List<List<Integer>>`
* `Arrays.asList()`

---

## ⏱️ Complexity

### Time Complexity

**O(n²)**

* Sorting takes `O(n log n)`.
* The two-pointer traversal takes `O(n²)`.
* Overall complexity: **O(n²)**.

### Space Complexity

**O(1)** auxiliary space, excluding the output list and internal sorting space.

---

## 🔍 Key Learning

The main lesson from this problem was learning how **sorting + two pointers** can reduce a brute-force `O(n³)` solution to an efficient **O(n²)** solution.

Handling duplicates carefully is also important to ensure that each triplet appears only once.