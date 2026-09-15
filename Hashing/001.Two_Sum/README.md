# Day 1 — Two Sum

**LeetCode:** Two Sum
**Difficulty:** Easy
**Language:** Java
**Topic:** Hashing
**Day:** 1

---

## 🧩 Problem

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

Each input is guaranteed to have exactly one solution, and the same element cannot be used twice.

---

## 🧠 Concepts Learned

* Hashing
* HashMap
* Array traversal
* Complement calculation
* One-pass lookup
* Key-value mapping

---

## ☕ Java Concepts

* `Map<Integer, Integer>`
* `HashMap<Integer, Integer>`
* `containsKey()`
* `get()`
* `put()`
* `new int[] { ... }`
* Java Generics
* Diamond operator `<>`

---

## 💡 Solution Idea

While traversing the array, calculate the number needed to reach the target:

```text
needed = target - current number
```

Before adding the current number to the `HashMap`, check whether the required number has already been seen.

The `HashMap` stores:

```text
Key   → Number
Value → Index
```

If the required number exists, its stored index and the current index form the answer.

---

## ⏱️ Complexity

* **Time:** `O(n)` average
* **Space:** `O(n)`

The array is traversed only once, while `HashMap` provides average `O(1)` lookup and insertion.

---

## 📝 What I Learned

* A `HashMap` can store a value together with its corresponding index.
* `containsKey()` can be used to efficiently check whether a required value has already been encountered.
* Java's `HashMap` is useful for reducing problems that would otherwise require nested loops from `O(n²)` to approximately `O(n)`.
* The Java Collections Framework provides convenient data structures for solving DSA problems.

---

## ⚠️ Mistakes / Improvements

* Remembered to check for the required number **before inserting the current number**.
* Learned the shorter Java syntax:

```java
Map<Integer, Integer> mp = new HashMap<>();
```

instead of:

```java
Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
```

---

**Day 1 complete. ☕🔥**