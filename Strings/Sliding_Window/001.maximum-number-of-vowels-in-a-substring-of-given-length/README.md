# Day 37 — Maximum Number of Vowels in a Substring of Given Length

**LeetCode 1456** | Difficulty: Medium

## 🧩 Problem
Given a string `s` and an integer `k`, find the maximum number of vowels in any contiguous substring of length `k`.

Vowels: `a`, `e`, `i`, `o`, `u`.

## 💡 Approach
- Count the vowels in the first window of size `k`.
- Slide the window one character at a time.
- Increment the vowel count if the incoming character is a vowel.
- Decrement the count if the outgoing character is a vowel.
- Update the maximum vowel count after each slide.

This avoids recalculating the vowel count for every substring.

## 🧠 Key Insight
In a fixed-size sliding window, only two elements change when the window moves: one element enters and one element leaves. Updating the count incrementally makes the solution efficient.

## ⏱️ Complexity
- **Time:** O(n), where `n` is the length of the string.
- **Auxiliary Space:** O(n) because `toCharArray()` creates a character array.

## 🛠️ Concepts Practiced
- Strings and character arrays
- Fixed-size sliding window
- Incremental frequency/count updates
- `Math.max()`
- Time and space complexity analysis

## ✅ Result
Solved successfully in Java using the fixed-size sliding window technique with O(n) time complexity.