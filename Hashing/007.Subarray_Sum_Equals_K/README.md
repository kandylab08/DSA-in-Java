# Day 21 — Subarray Sum Equals K

## 🧩 Problem
**LeetCode 560 — Subarray Sum Equals K**

Given an integer array `nums` and an integer `k`, return the total number of subarrays whose sum equals `k`.

### Example

```text
Input:
nums = [1,1,1]
k = 2

Output:
2
```

The valid subarrays are:

```text
[1,1]
[1,1]
```

## 💡 Approach

I used the **Prefix Sum + HashMap** technique.

While traversing the array, I maintain the current prefix sum:

```text
curSum
```

For every element, I check whether:

```text
curSum - k
```

has already appeared as a prefix sum.

If it has appeared `x` times, then there are `x` subarrays ending at the current position whose sum is `k`.

The HashMap stores:

```text
prefix sum → frequency
```

I initialize the map with:

```java
prefixSums.put(0, 1);
```

This handles subarrays that start from index `0`.

## 🧠 Key Concept Learned

### Prefix Sum + HashMap

The main relationship is:

```text
currentPrefixSum - previousPrefixSum = k
```

Therefore:

```text
previousPrefixSum = currentPrefixSum - k
```

Using a HashMap allows this previous prefix sum to be found in constant average time.

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

## 📚 What I Learned

- How prefix sums can be used to find subarray sums efficiently.
- How a HashMap can store the frequency of previously seen prefix sums.
- Why `prefixSums.put(0, 1)` is necessary.
- How the same prefix sum occurring multiple times can represent multiple valid subarrays.
- A useful pattern for solving subarray-sum problems in `O(n)` time.

## 💻 Java Concepts Used

- `HashMap`
- `getOrDefault()`
- Prefix Sum
- Enhanced `for` loop
- HashMap frequency counting