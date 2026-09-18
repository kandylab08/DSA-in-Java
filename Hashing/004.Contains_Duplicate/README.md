# Day 4 — Contains Duplicate

## 🧩 Problem

Given an integer array `nums`, determine whether any value appears **at least twice** in the array.

Return `true` if a duplicate exists; otherwise, return `false`.

### Example

**Input:**

```text
nums = [1, 2, 3, 1]
```

**Output:**

```text
true
```

**Explanation:**
The number `1` appears more than once.

---

## 💡 Solution

I used a **HashSet** to keep track of the elements that have already been encountered.

While traversing the array:

* If the number is not present in the set, it is added.
* If `add()` returns `false`, the number already exists in the set, which means a duplicate has been found.
* In that case, return `true` immediately.
* If the entire array is traversed without finding a duplicate, return `false`.

---

## 🧠 Concepts Learned

* `Set` interface
* `HashSet` in Java
* Generics with `Set<Integer>`
* Enhanced `for` loop
* `HashSet.add()` return value
* Duplicate detection using hashing
* Early return

### ⭐ Important Java Concept

`HashSet.add()` returns:

* `true` → element was successfully added because it was not already present.
* `false` → element already existed in the set.

So:

```java
if (!s.add(n))
```

directly checks whether the current number is a duplicate.

---

## ⏱️ Complexity

* **Time Complexity:** `O(n)` average
* **Space Complexity:** `O(n)`

Where `n` is the number of elements in the array.

---

## 📌 Key Takeaway

A `HashSet` is useful when we need to efficiently check whether an element has already appeared.

This problem helped me understand how Java's `HashSet` can be used for **fast membership checking and duplicate detection**.

---

## 🚀 Progress

**Java DSA — Day 4 ✅**

**Problem:** Contains Duplicate
**Primary Concept:** HashSet / Hashing
**Difficulty:** Easy