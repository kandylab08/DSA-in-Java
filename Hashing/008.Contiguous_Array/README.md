# Day 22 — Contiguous Array

## 🧩 Problem

**LeetCode 525 — Contiguous Array**

Given a binary array `nums`, find the maximum length of a contiguous subarray with an equal number of `0`s and `1`s.

---

## 💡 Approach

I maintain the count of `0`s and `1`s while traversing the array.

Instead of directly checking every possible subarray, I calculate a **difference**:

```text
difference = count[0] - count[1]
```

If the same difference appears at two different indices, the number of `0`s and `1`s between those indices must be equal.

### Example

For:

```text
[0, 1, 0, 1]
```

The difference changes like:

```text
1 → 0 → 1 → 0
```

When the same difference appears again, the elements between those positions contain an equal number of `0`s and `1`s.

I use a `HashMap` to store the **first index** where each difference occurs.

The map is initialized with:

```java
mp.put(0, -1);
```

This handles subarrays that start from index `0` without needing a separate condition.

For example, if the difference becomes `0` at index `3`, the length is:

```text
3 - (-1) = 4
```

---

## 🔑 Key Concept

### Prefix Difference + HashMap

The important observation is:

> If the same `count[0] - count[1]` value occurs at two different positions, the subarray between those positions contains an equal number of `0`s and `1`s.

Also, I store only the **first occurrence** of each difference because an earlier index always gives a longer subarray.

---

## 🧠 What I Learned

- Using a `HashMap` to store prefix states.
- Using the difference between two cumulative counts as a prefix state.
- Why the first occurrence of a prefix state should be preserved.
- How `0 → -1` initialization handles subarrays starting at index `0`.
- How prefix-state repetition can be used to find the longest valid subarray.
- A cleaner way to eliminate special-case conditions using `mp.put(0, -1)`.

---

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

Where `n` is the length of the input array.

---

## 📌 Takeaway

This problem showed me that a prefix state does not always have to be a traditional prefix sum.

Here, the difference between the number of `0`s and `1`s acts as the prefix state. When that state repeats, the portion between the two positions is balanced.

The key pattern I learned is:

```text
Same Prefix State
       ↓
Valid Subarray
       ↓
Store First Occurrence
       ↓
Maximum Length
```