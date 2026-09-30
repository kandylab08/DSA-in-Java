# Day 16 — Koko Eating Bananas

**LeetCode:** 875 — Koko Eating Bananas
**Difficulty:** Medium
**Language:** Java
**Topic:** Binary Search, Binary Search on Answer

## Problem

Given an array `piles`, where `piles[i]` represents the number of bananas in the `i`th pile, and an integer `h` representing the total number of hours available, find the minimum integer eating speed `k` such that Koko can finish all the bananas within `h` hours.

For a given eating speed `k`, the number of hours required for a pile containing `p` bananas is:

```text
ceil(p / k)
```

## Solution

The possible eating speed ranges from:

```text
1 → maximum pile size
```

For every possible speed, we can check whether Koko can finish all piles within `h` hours.

This creates a monotonic search space:

```text
Too slow → Too slow → Possible → Possible → Possible
```

Once a speed is possible, every larger speed will also be possible.

Therefore, binary search can be used to find the minimum valid speed.

### Checking a Speed

For each pile:

```java
count += (p + bananasCount - 1) / bananasCount;
```

This calculates the ceiling of:

```text
p / bananasCount
```

If the total required hours exceed `h`, the current speed is too slow.

## Complexity

Let:

* `n` = number of piles
* `M` = maximum number of bananas in a pile

**Time Complexity:** `O(n log M)`

**Space Complexity:** `O(1)`

## Concepts Learned

* Binary Search on Answer
* Monotonic search space
* Finding a valid range for binary search
* Ceiling division using integer arithmetic
* Early termination during validation
* Using `long` to safely store the total number of hours

## Key Learning

The important idea is not simply applying binary search, but recognizing when the **answer itself can be searched using binary search**.

For Koko:

```text
Small eating speed → may not finish in h hours
Large eating speed → can finish in h hours
```

This monotonic behavior allows us to efficiently find the minimum valid eating speed.

## Mistake / Improvement

Initially, the upper bound was set to:

```java
int high = 1000000000;
```

It was improved to:

```java
int high = 0;

for (int p : piles) {
    if (p > high) {
        high = p;
    }
}
```

This gives a tighter and more meaningful binary-search range because Koko never needs to eat faster than the largest pile size.