# 🟢 Day 13 — Valid Parentheses

**LeetCode #20 — Valid Parentheses**

## 📌 Problem

Given a string containing the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid when:

* Every opening bracket has a corresponding closing bracket.
* Brackets are closed in the correct order.
* Each closing bracket matches the most recent unmatched opening bracket.

### Examples

```text
Input:  "()"
Output: true
```

```text
Input:  "()[]{}"
Output: true
```

```text
Input:  "(]"
Output: false
```

```text
Input:  "([{}])"
Output: true
```

```text
Input:  "([)]"
Output: false
```

## 💡 Concept Learned

### Stack

A **Stack** follows the **LIFO (Last In, First Out)** principle.

This makes it suitable for bracket-matching because the most recently opened bracket must be the first one to be closed.

For example:

```text
"([{}])"

( → push
[ → push
{ → push

} → matches {
] → matches [
) → matches (

Stack becomes empty → Valid
```

## 🧠 Key Java Concepts

* `Stack<Character>`
* `push()`
* `peek()`
* `pop()`
* `isEmpty()`
* Enhanced `for` loop
* `String.toCharArray()`

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

Each character is processed once, and the stack can contain up to `n` characters in the worst case.

## 🎯 What I Learned

* How to use a **Stack** to solve matching and ordering problems.
* How **LIFO** behavior naturally fits nested brackets.
* How to use `push()`, `peek()`, `pop()`, and `isEmpty()` in Java.
* Why checking the final stack state is necessary after processing the string.
* Practiced handling edge cases such as unmatched and incorrectly ordered brackets.

---

**Day 13 completed ✅**

**Next:** Continue building consistency with Java DSA and learn more problems involving stacks and other core data structures.