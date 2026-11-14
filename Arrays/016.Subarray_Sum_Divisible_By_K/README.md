# Day 52 – Subarray Sums Divisible by K

**Problem:** [Subarray Sums Divisible by K – LeetCode 974]

**Difficulty:** Medium

**Topic:** Prefix Sum, HashMap, Modular Arithmetic

## Problem Statement

Given an integer array `nums` and an integer `k`, return the total number of non-empty subarrays whose sum is divisible by `k`.

## Approach: Prefix Sum + HashMap

Instead of calculating the sum of every possible subarray, we use prefix sums and remainder frequencies to solve the problem efficiently.

### 1. Prefix Sum Observation

Let `prefixSum[i]` represent the sum of all elements from index `0` to `i`.

The sum of a subarray from index `i` to `j` is:

`subarraySum = prefixSum[j] - prefixSum[i - 1]`

For a subarray sum to be divisible by `k`:

`(prefixSum[j] - prefixSum[i - 1]) % k == 0`

### 2. Key Mathematical Observation

If two prefix sums have the same remainder when divided by `k`, their difference is divisible by `k`.

For example, when `k = 5`:

- Prefix sum 14 gives remainder 4.
- Prefix sum 24 gives remainder 4.
- Their difference is 24 - 14 = 10, which is divisible by 5.

Therefore, instead of searching for equal prefix sums, we count prefix sums having equal remainders.

### 3. HashMap Frequency Counting

We use a HashMap to store:

- **Key:** Remainder of the prefix sum.
- **Value:** Frequency of that remainder.

For every element:

1. Update the running prefix sum.
2. Calculate its normalized remainder.
3. Check how many times this remainder has appeared previously.
4. Add that frequency to the answer.
5. Update the frequency of the current remainder.

### 4. Why Initialize `map.put(0, 1)`?

We initialize the HashMap with:

`map.put(0, 1);`

This represents the empty prefix sum.

It allows us to count valid subarrays that start at index `0`, whose prefix sum is itself divisible by `k`.

### 5. Handling Negative Remainders

Java's `%` operator can return negative remainders.

For example:

`-2 % 5 = -2`

To normalize the remainder into the range `[0, k - 1]`, we use:

`int remainder = ((prefixSum % k) + k) % k;`

This ensures that mathematically equivalent remainders are stored under the same HashMap key.

## Complexity Analysis

- **Time Complexity:** `O(n)` – We traverse the array exactly once, and HashMap operations take O(1) average time.
- **Space Complexity:** `O(min(n, k))` – We store frequencies of distinct remainders, with at most `min(n, k)` entries.

## Key Learnings

1. Learned how prefix sums can be combined with modular arithmetic.
2. Understood why two prefix sums with equal remainders produce a subarray sum divisible by `k`.
3. Used HashMap frequency counting to avoid checking every possible subarray.
4. Learned how to handle negative remainders in Java.
5. Understood the importance of initializing the frequency of remainder `0` to `1`.

## Important Pattern

**Prefix Sum + HashMap + Remainder Frequency**

When a subarray problem asks whether its sum is divisible by a number `k`, think about:

- Prefix sums.
- Equal remainders.
- Frequency counting using a HashMap.

---

**Day 52 Completed!** 🚀

Another day of building problem-solving skills and recognizing new DSA patterns.