# 🟢 Day 14 — Evaluate Reverse Polish Notation

**LeetCode #150 — Evaluate Reverse Polish Notation**

## 🧠 Problem

Given an array of strings `tokens` representing an arithmetic expression in **Reverse Polish Notation (RPN)**, evaluate the expression and return the result.

The valid operators are:

* `+`
* `-`
* `*`
* `/`

Operands can be integers or the results of previous expressions.

Integer division should truncate toward zero.

---

## 💡 Concept Learned

* Stack
* `Stack<Integer>` in Java
* `switch` statement
* `Integer.parseInt()`
* Operand ordering in arithmetic operations

---

## 🔍 Solution

I used a **Stack** to store operands.

* If the token is a number, push it onto the stack.
* If the token is an operator:

  1. Pop the second operand.
  2. Pop the first operand.
  3. Perform the operation.
  4. Push the result back onto the stack.
* After processing all tokens, the stack contains the final result.

### Important

The order of popping matters for subtraction and division:

```java
int op2 = st.pop();
int op1 = st.pop();
```

Then:

```java
op1 - op2
op1 / op2
```

For example:

```text
["10", "3", "/"]
```

becomes:

```text
10 / 3 = 3
```

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

Each token is processed exactly once.

**Space Complexity:** `O(n)`

In the worst case, the stack can contain `n` operands.

---

## 📚 Key Takeaway

Reverse Polish Notation becomes straightforward when using a stack:

```text
Number → Push
Operator → Pop → Calculate → Push Result
```

The main thing to remember is that for `-` and `/`, the **second popped value is the right operand**, while the **first popped value is the left operand**.

---

### ✅ Day 14 Status

**Problem Solved:** Evaluate Reverse Polish Notation
**LeetCode:** #150
**Topic:** Stack
**Difficulty:** Medium
**Status:** ✅ Solved