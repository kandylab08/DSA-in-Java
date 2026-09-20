# Day 6 — Best Time to Buy and Sell Stock

## 🧩 Problem

**LeetCode #121 — Best Time to Buy and Sell Stock**

Given an array `prices` where `prices[i]` represents the stock price on the `i-th` day, find the maximum profit that can be achieved by buying on one day and selling on a later day.

If no profit can be made, return `0`.

---

## 💡 Example

### Input

```text
[7, 1, 5, 3, 6, 4]
```

### Output

```text
5
```

Buy at `1` and sell at `6`.

```text
Profit = 6 - 1 = 5
```

### Another Example

```text
Input:  [7, 6, 4, 3, 1]
Output: 0
```

Since the price continuously decreases, no profitable transaction is possible.

---

## 🧠 Key Idea

While traversing the array, keep track of:

* The **minimum price** seen so far.
* The **maximum profit** possible by selling at the current price.

For every price:

```text
profit = current price - minimum price
```

Then update the maximum profit.

This allows the entire array to be processed in a single pass.

---

## 🔍 Dry Run

For:

```text
[7, 1, 5, 3, 6, 4]
```

| Price | Minimum Price | Current Profit | Maximum Profit |
| ----: | ------------: | -------------: | -------------: |
|     7 |             7 |              — |              0 |
|     1 |             1 |             -6 |              0 |
|     5 |             1 |              4 |              4 |
|     3 |             1 |              2 |              4 |
|     6 |             1 |              5 |              5 |
|     4 |             1 |              3 |              5 |

Final answer:

```text
5
```

---

## 📚 Concepts Learned

* Array traversal
* One-pass algorithms
* Greedy thinking
* Tracking minimum values
* Tracking maximum values
* Avoiding nested loops

---

## ⏱️ Complexity

```text
Time:  O(n)
Space: O(1)
```

The array is traversed only once and only two variables are used.

---

## 🧠 What I Learned

Instead of checking every possible pair of buying and selling days, I can keep track of the cheapest price seen so far.

At each position, I calculate the profit I would get by selling today and update the maximum profit if necessary.

This converts the straightforward `O(n²)` brute-force idea into an `O(n)` one-pass solution.

---


**Day 6 completed 🚀**