## Day 33 – Find the Difference of Two Arrays

**Problem:** Find the Difference of Two Arrays  
**Platform:** LeetCode  
**Difficulty:** Easy  
**Topic:** Arrays, HashSet, Hashing  
**Language:** Java

### Problem Summary
Given two integer arrays, return a list containing two lists:
- Distinct elements present in `nums1` but not in `nums2`.
- Distinct elements present in `nums2` but not in `nums1`.

### Approach
1. Create two `HashSet` collections to store the unique elements of each array.
2. Iterate through the first set and collect elements that are absent from the second set.
3. Iterate through the second set and collect elements that are absent from the first set.
4. Add both result lists to the final list in the required order and return it.

### Complexity Analysis
- **Time Complexity:** O(n + m) on average, where `n` and `m` are the lengths of the two arrays.
- **Space Complexity:** O(n + m) for the sets and result lists.

### Concepts Learned
- Using `HashSet` to store unique elements.
- Checking membership efficiently using `contains()`.
- Finding the difference between two sets.
- Working with nested lists in Java.
- Applying hashing to solve array problems efficiently.

### Key Takeaway
HashSet simplifies problems involving unique elements and membership checks by automatically removing duplicates and providing efficient average-case lookups.

**Status:** Completed ✅