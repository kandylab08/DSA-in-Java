# Day 23 — Daily Temperatures

## 🧩 Problem
**LeetCode 739 — Daily Temperatures**

Given an array of daily temperatures, return an array where `answer[i]` represents the number of days you have to wait after day `i` to get a warmer temperature.

If there is no future day with a warmer temperature, `answer[i] = 0`.

### Example

```text
Input:
[73, 74, 75, 71, 69, 72, 76, 73]

Output:
[1, 1, 4, 2, 1, 1, 0, 0]
```

---

## 💡 Approach

Used a **Monotonic Stack** to efficiently find the next warmer temperature.

The stack stores the **indices** of temperatures whose next warmer day has not been found yet.

For each temperature:

1. Check whether the current temperature is warmer than the temperature at the index on top of the stack.
2. If it is warmer, pop that index from the stack.
3. Calculate the number of days waited using:
   ```text
   currentIndex - previousIndex
   ```
4. Continue until the stack is empty or the current temperature is no longer warmer.
5. Push the current index onto the stack.
6. Any indices remaining in the stack have no warmer future day, so their answer remains `0`.

---

## 🔑 Key Concept

### Monotonic Stack

The stack maintains indices whose temperatures are arranged in **non-increasing order**.

When a warmer temperature is found, it resolves the pending indices from the stack.

This allows us to avoid repeatedly searching through future temperatures.

---

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

Each index is pushed onto the stack once and popped at most once.

---

## 📚 Concepts Learned

- Monotonic Stack
- Next Greater Element pattern
- Stack of indices
- Efficient `O(n)` array processing
- Using index differences to calculate waiting days

---

## 📝 What I Learned

This problem helped me understand that a stack can be used not only for matching brackets or evaluating expressions, but also for maintaining unresolved elements and efficiently finding their **next greater element**.

The key idea is to keep unresolved indices in a monotonic order and resolve them whenever a suitable greater value appears.

---

## 💻 Language

**Java**