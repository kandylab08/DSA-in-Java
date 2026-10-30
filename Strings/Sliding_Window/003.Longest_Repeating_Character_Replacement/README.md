# Day 40 – Longest Repeating Character Replacement

**Problem:** [LeetCode 424 – Longest Repeating Character Replacement]

**Topic:** Sliding Window, String, Frequency Array

## Approach
- Used a variable-size sliding window with two pointers (`left` and `right`).
- Maintained a frequency array of size 26 to track uppercase character occurrences.
- Tracked `maxFreq`, the maximum frequency encountered while expanding the window.
- Calculated the minimum replacements required using:

  `Window Length - maxFreq`

- If the required replacements exceeded `k`, shrank the window from the left.
- Updated the maximum valid window length throughout the traversal.
- Kept `maxFreq` unchanged while shrinking the window to avoid repeatedly recalculating the maximum frequency.

## Complexity Analysis
- **Time Complexity:** O(n) – Each character is added and removed at most once.
- **Space Complexity:** O(1) – A fixed-size frequency array of 26 characters.

## Concepts Learned
- Variable-size sliding window.
- Character frequency tracking using arrays.
- Maintaining a historical maximum frequency.
- Optimizing window validity checks.
- Understanding when a sliding window needs to shrink.

## Key Learning
The minimum number of replacements required to make all characters in a window identical is the window length minus the maximum character frequency. Maintaining the historical maximum frequency helps optimize the sliding-window solution.