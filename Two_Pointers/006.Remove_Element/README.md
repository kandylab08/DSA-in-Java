### Day 31 — Remove Element (LeetCode 27)

- **Topic:** Arrays, Two Pointers, In-Place Modification
- **Difficulty:** Easy
- **Language:** Java

**Problem:** Remove all occurrences of a given value from an array in-place and return the number of remaining elements.

**Solution:** Used a read pointer (`i`) to traverse the array and a write pointer (`k`) to place elements that are not equal to the target value. Each valid element is copied to the next available position, and `k` is returned as the new logical length.

**Complexity Analysis:**
- Time Complexity: O(n)
- Space Complexity: O(1)

**Concepts Learned:**
- Using separate read and write pointers.
- Modifying arrays in-place without creating another array.
- Maintaining a logical length for the valid portion of an array.
- Avoiding unnecessary assignments when the read and write pointers are equal (optional optimization).

**Key Takeaway:** A write pointer can efficiently compact an array by retaining only the elements that satisfy a condition, using linear time and constant extra space.