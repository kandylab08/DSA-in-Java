# 🟢 Day 10 — Longest Substring Without Repeating Characters

**LeetCode #3 — Longest Substring Without Repeating Characters**

## 📌 Problem

Given a string `s`, find the length of the longest substring without repeating characters.

### Example

```text
Input:  s = "abcabcbb"
Output: 3
```

The longest substring without repeating characters is `"abc"`.

```text
Input:  s = "bbbbb"
Output: 1
```

---

## 💡 Key Concepts

* Sliding Window
* Two Pointers
* Arrays
* Last Seen Index
* Character Frequency / Tracking
* `Arrays.fill()`

---

## 🧠 Solution

I used a **sliding window** with two pointers:

* `left` → start of the current window
* `right` → end of the current window
* `lastSeen` → stores the most recent index of every character

When a repeated character is found inside the current window, `left` is moved to one position after its previous occurrence.

---

## 🔍 How It Works

For:

```text
s = "abcabcbb"
```

The window initially expands:

```text
[a]
[ab]
[abc]
```

When the second `a` is encountered, the previous `a` was at index `0`.

So:

```text
left = 0 + 1
```

The window becomes:

```text
[bca]
```

The same process continues while keeping track of the longest valid window.

The condition:

```java
if (lastSeen[c] >= left)
```

ensures that `left` only moves forward when the previous occurrence is actually inside the current window.

---

## ⏱️ Complexity

* **Time:** `O(n)`
* **Space:** `O(1)`

The space is considered `O(1)` because the `lastSeen` array has a fixed size of 128.

---

## 📚 What I Learned

* How to implement a **sliding window** using two pointers.
* How storing the **last seen index** can avoid repeatedly scanning a substring.
* Why `left` must never move backward.
* How an array can be used instead of a `HashMap` when the character range is known.
* Improved understanding of when to shrink and expand a sliding window.

---

## 🏷️ Tags

`Java` `LeetCode` `Arrays` `Sliding Window` `Two Pointers` `Hashing` `Strings`

---

**Day 10 completed ✅**