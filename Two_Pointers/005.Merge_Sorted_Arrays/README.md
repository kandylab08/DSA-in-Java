### Day 30 — Merge Sorted Array

**Problem:** [Merge Sorted Array — LeetCode 88]

**Topic:** Arrays, Two Pointers

**Approach:**
- Used three pointers to track the last valid elements of both arrays and the last available position in `nums1`.
- Compared elements from the ends of the arrays and placed the larger element at the end of `nums1`.
- Continued until all elements of `nums2` were merged.
- Worked in-place without allocating another array.

**Complexity Analysis:**
- Time Complexity: O(m + n)
- Auxiliary Space: O(1)

**Key Learnings:**
- Merging from the end prevents overwriting valid elements in `nums1`.
- When `nums2` is exhausted, the remaining elements of `nums1` are already correctly positioned.
- Three pointers can merge sorted arrays efficiently in-place.

**Status:** Solved ✅