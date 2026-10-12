## Day 28 — Move Zeroes

**Problem:** [Move Zeroes — LeetCode 283]

### Approach
- Used the **Two Pointers** technique.
- Maintained `i` to traverse the array and `k` to track the position for the next non-zero element.
- Swapped each non-zero element into its correct position.
- Preserved the relative order of non-zero elements while moving all zeroes to the end.
- Modified the array in-place without using an additional array.

### Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### Key Learnings
- Applied two pointers to solve an array manipulation problem in-place.
- Practiced maintaining element order while rearranging an array.
- Identified unnecessary self-swaps and explored reducing redundant operations without changing the overall time complexity.

**Status:** Solved ✅