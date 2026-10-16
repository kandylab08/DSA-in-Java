### Day 29 — Remove Duplicates from Sorted Array
- **Problem:** [LeetCode 26 — Remove Duplicates from Sorted Array]
- **Language:** Java
- **Difficulty:** Easy
- **Topic:** Arrays, Two Pointers, In-Place Modification

**Approach:**
- Used two pointers: `i` to scan the array and `k` to track the position of the last unique element.
- Since the array is sorted, duplicates appear next to each other.
- Whenever `nums[i] != nums[k]`, incremented `k` and copied the new unique element to `nums[k]`.
- Returned `k + 1` as the number of unique elements.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**What I Learned:**
- How to remove duplicates in-place without using an extra array or a HashSet.
- How sorted arrays make duplicate detection easier.
- How two pointers can be used to separate scanning from writing.

**Mistakes / Improvements:**
- Initially considered the return value carefully: `k + 1` represents the number of unique elements, not the last index.
- The solution assumes the array is non-empty, as guaranteed by the problem constraints. An empty-array check can make it more robust.