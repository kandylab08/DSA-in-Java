# Day 20 — Kth Missing Positive Number

## 🧩 Problem

**LeetCode 1539 — Kth Missing Positive Number**

Given a strictly increasing array of positive integers `arr` and an integer `k`, find the `k`th positive integer that is missing from the array.

### Example

```text
Input:  arr = [2,3,4,7,11], k = 5
Output: 9
```

The missing positive numbers are:

```text
1, 5, 6, 8, 9, ...
```

The 5th missing number is `9`.

---

## 💡 Approach

I used **Binary Search** to find the position where the `k`th missing number belongs.

For an element at index `mid`, the number of missing positive integers before `arr[mid]` is:

```text
arr[mid] - mid - 1
```

- If the number of missing values is less than `k`, the answer must be to the right.
- Otherwise, the answer is at `mid` or somewhere to the left.

After the binary search, `low` represents how many elements from the array are smaller than the answer.

Therefore, the answer is:

```text
low + k
```

---

## 🧠 Key Concept Learned

- Binary Search on a sorted array
- Finding a boundary using a calculated condition
- Counting missing elements using the index
- Understanding how `low` can represent the insertion position of the answer

### Important Formula

```text
Missing numbers before arr[i] = arr[i] - i - 1
```

---

## ⏱️ Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---

## ⚠️ Mistake / Learning

Initially, I used:

```java
arr[mid] - mid + 1
```

which gave incorrect results.

The correct formula is:

```java
arr[mid] - mid - 1
```

because there are `mid + 1` existing elements from `1` through `arr[mid]`.

---

## 📌 Takeaway

This problem helped me understand how binary search can be used not only to search for an exact value, but also to find the **correct boundary/position** based on a calculated condition.