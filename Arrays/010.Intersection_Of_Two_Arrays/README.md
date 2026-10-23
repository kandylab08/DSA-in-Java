### Day 34 — Intersection of Two Arrays

**Problem:** [Intersection of Two Arrays — LeetCode 349]

**Difficulty:** Easy

**Topics:** Arrays, HashSet, Hashing

**What I learned**
- Used a `HashSet` for efficient membership checks.
- Used `remove()` to check whether an element exists and prevent duplicate additions in a single operation.
- Practiced converting a `List<Integer>` into an `int[]`.
- Improved the solution by eliminating the need for a second set.

**Complexity Analysis**
- **Time:** O(n + m) average
- **Auxiliary Space:** O(n) for the set, excluding the output list and array.

**Key Takeaway:** A data structure can sometimes perform two jobs at once. Removing matched elements from a set provides both membership checking and duplicate prevention.