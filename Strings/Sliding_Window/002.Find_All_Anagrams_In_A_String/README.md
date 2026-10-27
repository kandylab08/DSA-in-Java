# Day 38 – Find All Anagrams in a String

**Platform:** LeetCode  
**Problem:** [Find All Anagrams in a String – LeetCode 438]  
**Language:** Java  
**Difficulty:** Medium  
**Topic:** Sliding Window, Frequency Array

## Problem Statement

Given two strings `s` and `p`, find all starting indices of substrings in `s` that are anagrams of `p`.

An anagram contains exactly the same characters with the same frequencies, but the characters may appear in a different order.

## Approach

- Created two frequency arrays of size 26 to store the character frequencies of `p` and the current window in `s`.
- Initialized the first window with a length equal to `p.length()`.
- Compared the frequency arrays using `Arrays.equals()` to check whether the current window is an anagram.
- Used a fixed-size sliding window to move through the remaining characters of `s`.
- Added the incoming character's frequency and removed the outgoing character's frequency at each step.
- Recorded the starting index whenever both frequency arrays matched.
- Returned an empty list if `p` was longer than `s`.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the length of `s`. Each window update takes constant time, and comparing the two fixed-size arrays takes O(26) time.
- **Auxiliary Space Complexity:** O(1), because the two frequency arrays have a fixed size of 26, excluding the output list.

## Concepts Learned

- Applying the fixed-size sliding window technique.
- Using frequency arrays to compare character distributions.
- Understanding that Java arrays require `Arrays.equals()` for content comparison.
- Updating a sliding window by adding an incoming character and removing an outgoing character.
- Calculating correct starting indices while moving a window.

## Key Takeaway

A substring is an anagram of the target when both contain exactly the same character frequencies. A fixed-size sliding window allows us to check every possible substring efficiently without creating new substring objects.

**Day 38 completed!** 🚀