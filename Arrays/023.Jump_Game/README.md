### Day 63 – Jump Game

**Problem:** [Jump Game – LeetCode 55]

**Difficulty:** Medium

**Topic:** Array, Greedy

**Approach:**
- Maintain a variable `maxReach` to track the farthest index reachable so far.
- Iterate through the array and check whether the current index is reachable.
- If `i > maxReach`, return `false` because we cannot reach the current position.
- Update `maxReach` using `Math.max(maxReach, i + nums[i])` to preserve the farthest reachable position.
- If `maxReach` reaches or exceeds the last index, return `true`.

**Time Complexity:** O(n) – Single traversal of the array.

**Space Complexity:** O(1) – Only a constant amount of extra space is used.

**Key Learnings:**
- Understood the Greedy approach through the concept of maximum reachability.
- Learned why `Math.max()` is necessary to preserve previously achieved reach.
- Understood how an unreachable index helps determine whether the destination is possible.
- Practiced making greedy decisions without losing previously available possibilities.

**Key Takeaway:** Always maintain the farthest reachable index instead of blindly replacing it with the reach calculated at the current index.