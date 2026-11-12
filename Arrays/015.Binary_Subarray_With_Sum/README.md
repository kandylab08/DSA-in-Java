# Day 51 – Binary Subarrays With Sum

**Problem:** [LeetCode 930 – Binary Subarrays With Sum]

**Difficulty:** Medium

**Topics:** Sliding Window, Prefix Sum, HashMap, Subarray Counting

## Problem

Given a binary array `nums` and an integer `goal`, return the number of non-empty subarrays whose sum is equal to `goal`.

### Example

**Input:**
```text
nums = [1,0,1,0,1], goal = 2
```

**Output:**
```text
4
```

**Explanation:**

The four subarrays with sum equal to 2 are:
- `[1,0,1]`
- `[1,0,1,0]` (starting at index 0)
- `[0,1,0,1]`
- `[1,0,1]` (ending at index 4)

## Approach 1: Sliding Window + Prefix Zero Counting

### Intuition

Since the array contains only binary values (0 and 1), we can use a sliding window to maintain a subarray whose sum does not exceed the target.

When the window sum equals `goal`, there may be multiple valid subarrays because of leading zeros.

We use `prefixZeros` to count these additional starting positions.

### Algorithm

1. Expand the window by adding `nums[right]` to the current sum.
2. If the sum exceeds `goal`, shrink the window from the left.
3. Reset `prefixZeros` whenever the left boundary moves because the sum exceeds the target.
4. When the sum equals `goal`, count consecutive leading zeros.
5. Add `prefixZeros + 1` to the answer.

### Complexity

- **Time:** O(n)
- **Space:** O(1)

## Approach 2: At Most Sliding Window

### Intuition

Instead of directly counting subarrays with an exact sum, we calculate:

```text
Exactly(goal) = AtMost(goal) - AtMost(goal - 1)
```

`AtMost(k)` counts all subarrays whose sum is less than or equal to `k`.

Subtracting the number of subarrays with sums less than `goal` leaves only those with an exact sum equal to `goal`.

### Algorithm

1. Create a helper function `atMost()` that counts subarrays with sum at most the given target.
2. Maintain a sliding window with `left` and `right`.
3. Shrink the window whenever its sum exceeds the target.
4. For each valid window, add `right - left + 1` to the count.
5. Subtract `atMost(goal - 1)` from `atMost(goal)`.

### Why `right - left + 1`?

For every valid window ending at `right`, all subarrays starting between `left` and `right` are also valid.

Therefore, the number of valid subarrays ending at the current index is:

```text
right - left + 1
```

### Complexity

- **Time:** O(n)
- **Space:** O(1)

## Approach 3: Prefix Sum + HashMap

### Intuition

Prefix Sum allows us to calculate the sum of any subarray using the difference between two prefix sums.

The key formula is:

```text
Subarray Sum = PrefixSum[right] - PrefixSum[left - 1]
```

For a subarray sum equal to `goal`:

```text
PrefixSum[left - 1] = PrefixSum[right] - goal
```

Therefore, for every current prefix sum, we look for the frequency of:

```text
required = prefixSum - goal
```

A HashMap stores the frequency of previously encountered prefix sums.

### Algorithm

1. Initialize a HashMap to store prefix sum frequencies.
2. Insert `0` with frequency `1` to handle subarrays starting at index 0.
3. Maintain a running `prefixSum`.
4. For every element:
   - Update the running prefix sum.
   - Calculate `required = prefixSum - goal`.
   - Add the frequency of `required` to the answer.
   - Update the frequency of the current prefix sum in the HashMap.
5. Return the total count.

### Dry Run

**Input:**
```text
nums = [1,0,1,0,1]
goal = 2
```

Initial HashMap:
```text
{0=1}
```

| Index | Number | Prefix Sum | Required | New Subarrays |
|---:|---:|---:|---:|---:|
| 0 | 1 | 1 | -1 | 0 |
| 1 | 0 | 1 | -1 | 0 |
| 2 | 1 | 2 | 0 | 1 |
| 3 | 0 | 2 | 0 | 1 |
| 4 | 1 | 3 | 1 | 2 |

**Total = 4**

### Why store frequencies instead of just checking existence?

The same prefix sum can appear multiple times.

Each occurrence represents a different possible starting position for a valid subarray.

Therefore, we must store the frequency of each prefix sum rather than simply checking whether it exists.

### Why initialize `map.put(0, 1)`?

It represents an empty prefix with sum zero.

This allows us to count subarrays starting from index 0 without requiring a special condition.

### Complexity

- **Time:** O(n) average
- **Space:** O(n)

## Key Learnings

1. A binary array allows efficient sliding-window techniques because all elements are non-negative.
2. Leading zeros can create multiple valid subarrays with the same sum.
3. The At Most technique helps convert an exact-counting problem into two simpler counting problems.
4. The formula `Exactly(K) = AtMost(K) - AtMost(K - 1)` is a reusable pattern.
5. Prefix Sum + HashMap helps count subarrays with a target sum by tracking previous prefix sum frequencies.
6. Prefix Sum + HashMap also works with negative numbers, where ordinary sum-based sliding windows may fail.

## Patterns Practiced

- Sliding Window
- Prefix Zero Counting
- At Most K Technique
- Prefix Sum
- HashMap Frequency Counting
- Subarray Counting

---

**Day 51 Completed!** 🚀

Three approaches to one problem, with a deeper understanding of sliding windows and prefix sums.

**Today's biggest takeaway:** Instead of checking every possible subarray, use previously calculated information to count valid subarrays efficiently.