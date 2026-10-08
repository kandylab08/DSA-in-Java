# Day 24 — Next Greater Element II

## Problem

Given a circular integer array `nums`, return an array `res` where `res[i]` is the next greater element for `nums[i]`.

Since the array is circular, after reaching the last element, we continue searching from the beginning of the array.

If no greater element exists, return `-1`.

**LeetCode:** 503 — Next Greater Element II

---

## Example

### Input
```text
nums = [1, 2, 1]
```

### Output
```text
[2, -1, 2]
```

### Explanation

- For `1` → next greater element is `2`
- For `2` → no greater element exists → `-1`
- For the last `1` → continue from the beginning → `2`

---

## Approach

I used a **Monotonic Stack** to efficiently find the next greater element.

Since the array is circular, I simulated traversing the array twice using:

```java
int k = i % n;
```

The loop runs from `0` to `2 * n - 1`.

The stack stores **indices** of elements whose next greater element has not been found yet.

For every element:

1. If the stack is empty, push the current index.
2. If the current element is not greater than the element at the top of the stack, push the current index.
3. If the current element is greater, keep popping indices while their values are smaller than the current value.
4. For every popped index, the current value is its next greater element.
5. Push the current index afterward.

The result array is initially filled with `-1`, so elements that never find a greater element automatically remain `-1`.

---

## Key Concept

### Monotonic Decreasing Stack

The stack maintains indices whose corresponding values are arranged in decreasing order.

For example:

```text
nums = [5, 4, 3]
```

The stack represents:

```text
5
4
3
```

When a larger value appears:

```text
nums = [5, 4, 3, 6]
```

`6` is greater than all of them, so they can all be resolved:

```text
3 → 6
4 → 6
5 → 6
```

This allows us to avoid repeatedly searching through the array.

---

## Handling the Circular Array

Instead of creating a second copy of the array, I used:

```java
for (int i = 0; i < 2 * n; i++) {
    int k = i % n;
}
```

For:

```text
[1, 2, 1]
```

the indices effectively become:

```text
0 1 2 0 1 2
```

This allows elements near the end of the array to find greater elements near the beginning.

---

## Complexity

### Time Complexity

```text
O(n)
```

Although the array is traversed twice, each index is pushed and popped from the stack only a limited number of times.

### Space Complexity

```text
O(n)
```

The stack and result array require linear extra space.

---

## What I Learned

- How to use a **monotonic stack** for Next Greater Element problems.
- How to store **indices instead of values** in a stack.
- How to handle **circular arrays** using `i % n`.
- How one stack pattern can be reused across different problems.
- Why elements can be resolved when a larger element appears.
- How to achieve `O(n)` time instead of using nested loops.

---

## DSA Pattern

**Pattern:** Monotonic Stack

**Related Problem:** Daily Temperatures — Day 23

**Difficulty:** Medium

**Day:** 24