# Day 19 — Minimum Number of Days to Make m Bouquets

## Problem

**LeetCode 1482 — Minimum Number of Days to Make m Bouquets**

Given an integer array `bloomDay`, where `bloomDay[i]` represents the day the `i-th` flower blooms, we need to make `m` bouquets.

Each bouquet requires exactly `k` **adjacent flowers**, and each flower can be used only once.

Return the minimum number of days needed to make `m` bouquets.

If it is impossible, return `-1`.

---

## Approach

### Binary Search on Answer

Instead of checking every possible day one by one, we binary search for the minimum valid day.

- `low` = minimum value in `bloomDay`
- `high` = maximum value in `bloomDay`
- `mid` = the day we are currently testing

For each `mid`, we check whether it is possible to make at least `m` bouquets by that day.

### Feasibility Check

For a given day:

1. Traverse the `bloomDay` array.
2. If `bloomDay[i] <= mid`, the flower has bloomed.
3. Count consecutive bloomed flowers.
4. Whenever `k` consecutive flowers are found:
   - Form one bouquet.
   - Increase the bouquet count.
   - Reset the consecutive flower count to `0`.
5. If at least `m` bouquets can be formed, the day is valid.

If the current day is valid, search for an earlier day.

Otherwise, search for a later day.

---

## Important Observation

If:

```text
m × k > bloomDay.length
```

then it is impossible to make the required number of bouquets.

Therefore, return `-1` immediately.

The multiplication is performed using `long` to avoid integer overflow:

```java
if ((long) m * k > bloomDay.length)
    return -1;
```

---

## Example

### Input

```text
bloomDay = [1, 10, 3, 10, 2]
m = 3
k = 1
```

### Output

```text
3
```

By day `3`, the flowers that have bloomed are:

```text
[✓, ✗, ✓, ✗, ✓]
```

Since `k = 1`, each bloomed flower can form a bouquet.

Therefore, `3` bouquets can be made on day `3`.

---

## Key Concepts Learned

- Binary Search on Answer
- Feasibility checking
- Adjacent elements
- Counting consecutive elements
- Greedy grouping
- Search space reduction
- Handling impossible cases
- Integer overflow prevention using `long`

---

## Complexity

Let `n` be the number of flowers.

### Time Complexity

```text
O(n × log(maxBloomDay - minBloomDay))
```

Each binary-search step scans the entire array once.

### Space Complexity

```text
O(1)
```

Only a constant amount of extra space is used.

---

## What I Learned

This problem strengthened my understanding of **Binary Search on Answer**.

The main challenge was not binary search itself, but designing the `canMakeBouquets()` feasibility function.

I learned how to track consecutive valid elements and reset the count when a flower has not bloomed. I also learned that after forming a bouquet, the flower count must be reset so that flowers are not reused.

This problem also reinforced the importance of checking impossible cases before starting the binary search.