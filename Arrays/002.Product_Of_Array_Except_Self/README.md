# Day 6 — Product of Array Except Self

## 🧩 Problem

**LeetCode #238 — Product of Array Except Self**

Given an integer array `nums`, return an array `answer` such that:

```text
answer[i] = product of all elements of nums except nums[i]
```

The solution should be completed without using division.

---

## 💡 Concepts Learned

* Prefix Product
* Suffix Product
* Array Traversal
* Prefix + Suffix Technique
* In-place use of the result array
* Space optimization
* `O(1)` extra space

---

## 🧠 My First Solution

I initially solved the problem using two separate arrays:

* `arrP` → stores prefix products
* `arrS` → stores suffix products
* `res` → combines both

For every index:

```text
res[i] = prefix[i] × suffix[i]
```

### Complexity

```text
Time:  O(n)
Space: O(n)
```

---

## 🚀 Optimized Solution

The solution can be optimized by eliminating the prefix and suffix arrays.

### Step 1 — Prefix Product

Store the prefix products directly inside the result array.

```java
res[0] = 1;

for (int i = 1; i < n; i++) {
    res[i] = res[i - 1] * nums[i - 1];
}
```

### Step 2 — Suffix Product

Instead of creating another array, maintain a single variable:

```java
int suffix = 1;
```

Traverse from right to left and multiply the current result by the suffix product.

```java
for (int i = n - 1; i >= 0; i--) {
    res[i] = res[i] * suffix;
    suffix *= nums[i];
}
```

### Final Complexity

```text
Time:  O(n)
Space: O(1) extra space
```

The result array is considered output space, so it is not counted as extra space.

---

## 🧪 Example

### Input

```text
[1, 2, 3, 4]
```

### Output

```text
[24, 12, 8, 6]
```

### Breakdown

```text
1 → 2 × 3 × 4 = 24
2 → 1 × 3 × 4 = 12
3 → 1 × 2 × 4 = 8
4 → 1 × 2 × 3 = 6
```

---

## 📚 What I Learned

Today I learned how prefix and suffix information can be combined to solve an array problem efficiently.

More importantly, I learned that separate prefix/suffix arrays are not always necessary. The result array itself can store prefix information while a single variable tracks the suffix product.

This reduced my solution from:

```text
O(n) extra space
```

to:

```text
O(1) extra space
```

while keeping the time complexity at:

```text
O(n)
```

---

**Day 6 completed successfully 🚀**