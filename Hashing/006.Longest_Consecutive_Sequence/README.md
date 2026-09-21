# 🟢 Day 7 — Longest Consecutive Sequence

**LeetCode #128 — Longest Consecutive Sequence**

## 📌 Problem

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

The solution must run in **O(n)** time.

### Example

```text
Input:  nums = [100, 4, 200, 1, 3, 2]
Output: 4
```

The longest consecutive sequence is:

```text
1 → 2 → 3 → 4
```

---

## 💡 Key Concept

The main idea is to use a **HashSet** for constant-time average lookups.

Instead of sorting the array, store all numbers in a `HashSet`.

For every number, check whether its previous number exists:

```java
if (!numSet.contains(num - 1))
```

If it doesn't exist, the current number is the **start of a consecutive sequence**.

Then keep checking for the next numbers:

```text
num → num + 1 → num + 2 → ...
```

and track the longest sequence found.

---

## 🧠 Concepts Learned

* `HashSet`
* `Set<Integer>`
* Average `O(1)` lookup
* Detecting the beginning of a sequence
* Consecutive sequence traversal
* Avoiding sorting to achieve `O(n)` time
* `Math.max()`
* Enhanced `for` loop

---

## ⏱️ Complexity

### Time Complexity

**O(n)** average

Each number is processed efficiently using `HashSet` lookups.

### Space Complexity

**O(n)**

The `HashSet` stores the elements from the input array.

---

## 🔑 Important Takeaway

> Don't always sort when you need to find consecutive elements.

A `HashSet` can help identify sequence starts and check consecutive numbers in average `O(1)` time, allowing the entire problem to be solved in **O(n)** time.
