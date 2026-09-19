# Day 5 — Top K Frequent Elements

## 🧩 Problem

**LeetCode:** [Top K Frequent Elements]

**Difficulty:** Medium

**Category:** Hashing, Heap / Priority Queue

---

## 📌 Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

The answer may be returned in any order.

### Example

```text
Input:
nums = [1,1,1,2,2,3]
k = 2

Output:
[1,2]
```

---

## 💡 Key Idea

The problem can be solved using two main data structures:

1. **HashMap** — to count how many times each number appears.
2. **Min Heap (PriorityQueue)** — to keep track of the `k` elements with the highest frequencies.

Instead of storing every element in the heap, we maintain the heap size at most `k`.

Whenever the heap size becomes greater than `k`, we remove the element with the lowest frequency.

At the end, the heap contains the `k` most frequent elements.

---

## 🔍 Step-by-Step

### 1. Count Frequencies

Use a `HashMap` where:

```text
Key   → Number
Value → Frequency
```

For:

```text
[1,1,1,2,2,3]
```

the map becomes:

```text
1 → 3
2 → 2
3 → 1
```

---

### 2. Create a Min Heap

The `PriorityQueue` is configured using a custom comparator based on the frequencies stored in the HashMap.

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>(
        (n1, n2) -> Integer.compare(mp.get(n1), mp.get(n2))
);
```

The element with the **lowest frequency** stays at the top.

---

### 3. Maintain Heap Size `k`

For every unique number:

```java
minHeap.add(n);

if (minHeap.size() > k) {
    minHeap.poll();
}
```

When the heap becomes larger than `k`, the least frequent element is removed.

Therefore, after processing all elements, only the `k` most frequent elements remain.

---

### 4. Build the Result

Extract the remaining elements from the heap:

```java
int[] result = new int[k];

for (int i = 0; i < k; i++) {
    result[i] = minHeap.poll();
}
```

---

## ⏱️ Complexity

Let:

* `n` = number of elements in `nums`
* `m` = number of unique elements

### Time Complexity

```text
Frequency counting: O(n)
Heap operations:    O(m log k)
Result extraction:  O(k)

Overall: O(n + m log k)
```

Since `m ≤ n`, this can be considered:

```text
O(n log k)
```

### Space Complexity

```text
HashMap: O(m)
Heap:    O(k)
Result:  O(k)

Overall: O(m + k)
```

---

## 🧠 Concepts Learned

* HashMap
* Frequency counting
* `getOrDefault()`
* `PriorityQueue`
* Min Heap
* Custom Comparator
* Lambda expressions
* `keySet()`
* Maintaining a fixed-size heap
* Combining multiple data structures

---

## ⚠️ Important Learning

A useful pattern learned today:

> **When you need the top `k` elements, a heap of size `k` can avoid sorting all elements.**

Instead of sorting every frequency, we continuously maintain only the `k` candidates that matter.

---

## 📈 DSA Progress

**Day:** 5
**Problem:** Top K Frequent Elements
**Difficulty:** Medium
**Language:** Java
**Status:** ✅ Solved

### Main Topics

`HashMap` → `PriorityQueue` → `Min Heap`

---

## 🚀 What I Learned Today

Today I learned how to combine a **HashMap with a Min Heap** to efficiently find the `k` most frequent elements.

The biggest takeaway was understanding why we use a **Min Heap of size `k`**: the least frequent element can be removed whenever the heap exceeds `k`, leaving only the most frequent elements.

This problem also helped me get more comfortable with Java's `PriorityQueue` and custom lambda comparators.