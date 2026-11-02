# Day 42 – Permutation in String

## Problem: 567. Permutation in String

**Difficulty:** Medium  
**Topic:** Sliding Window, String, Frequency Array  
**Language:** Java

### Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

A permutation is a rearrangement of all the characters of a string. The resulting substring must contain exactly the same characters with the same frequencies.

**Example 1:**

```text
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: The substring "ba" is a permutation of "ab".
```

**Example 2:**

```text
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
Explanation: No substring of s2 is a permutation of s1.
```

### Approach: Fixed-Size Sliding Window + Frequency Array

The key observation is that a permutation must have exactly the same character frequencies as the original string.

Instead of generating every possible permutation, we use two frequency arrays to compare character counts efficiently.

Since every permutation of `s1` has the same length as `s1`, we use a **fixed-size sliding window** over `s2`.

### Algorithm

1. Create two integer arrays of size 26:
   - `freq1` stores the frequency of each character in `s1`.
   - `freq2` stores the frequency of characters in the current window of `s2`.

2. Calculate the lengths of both strings.

3. If `s1` is longer than `s2`, return `false` because a permutation cannot fit inside `s2`.

4. Build the initial window:
   - Count the character frequencies of `s1`.
   - Count the frequencies of the first `s1.length()` characters of `s2`.

5. Compare both frequency arrays using `Arrays.equals()`.
   - If they match, return `true`.

6. Slide the window through the remaining characters of `s2`:
   - Add the incoming character to the window.
   - Remove the outgoing character from the window.
   - Compare the updated frequency arrays.

7. If any window has matching frequencies, return `true`. Otherwise, return `false`.

### Dry Run

**Input:**

```text
s1 = "ab"
s2 = "eidbaooo"
```

Required character frequencies:

```text
a = 1
b = 1
```

The sliding window size is 2.

| Window | Characters | Match? |
|---|---|---|
| 1 | ei | No |
| 2 | id | No |
| 3 | db | No |
| 4 | ba | Yes |

When the window reaches `"ba"`, its character frequencies match those of `"ab"`.

Therefore, the function returns `true`.

### Complexity Analysis

Let:
- `n` = length of `s2`
- `m` = length of `s1`

**Time Complexity: O(26 × n) = O(n)**

- Building the initial frequency arrays takes O(m).
- Sliding the window takes O(n - m) iterations.
- Each `Arrays.equals()` comparison checks 26 elements, which takes O(26).
- Since the alphabet size is fixed, the overall time complexity is O(n).

**Space Complexity: O(26) = O(1)**

- Two frequency arrays of size 26 are used.
- No additional data structures are required.
- Space usage remains constant regardless of input size.

### Key Learnings

- Understood how to solve permutation-related problems using character frequency arrays.
- Practiced the fixed-size sliding window technique.
- Learned how to update a window by adding an incoming element and removing an outgoing element.
- Used `Arrays.equals()` to compare frequency arrays.
- Avoided generating permutations, which would be inefficient.
- Understood why a fixed-size window is necessary when checking permutations.

### Concepts Practiced

- Sliding Window (Fixed Size)
- Frequency Counting
- Character Arrays
- String Manipulation
- Array Comparison
- Java `Arrays.equals()`

---

**Day 42 Completed!** 🚀

Continuing the Java DSA journey, one problem at a time.