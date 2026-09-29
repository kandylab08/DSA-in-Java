# Day 15 — Search a 2D Matrix

## Problem

**LeetCode #74 — Search a 2D Matrix**

Given an `m × n` matrix where:

* Each row is sorted in ascending order.
* The first element of each row is greater than the last element of the previous row.

Return `true` if `target` exists in the matrix, otherwise return `false`.

## Solution

The solution uses **two binary searches**.

### Step 1 — Find the Possible Row

Binary search is performed on the rows.

For each middle row, check whether the target can exist between:

```java
matrix[midRow][0]
```

and

```java
matrix[midRow][highCol]
```

If the target is within this range, that row is selected.

Otherwise:

* If the target is greater than the row's first element, search lower rows.
* Otherwise, search higher rows.

### Step 2 — Binary Search Inside the Row

Once the possible row is identified, a second binary search is performed on that row to find the target.

If the target is found, return `true`. Otherwise, return `false`.

## Complexity

Let:

* `m` = number of rows

* `n` = number of columns

* **Time:** `O(log m + log n)`

* **Space:** `O(1)`

## Concepts Learned

* Binary Search
* Binary Search on a 2D matrix
* Searching across rows
* Searching within a sorted row
* Maintaining search boundaries
* Applying binary search to more than one dimension

## Key Learning

A sorted 2D matrix can often be searched efficiently by identifying the possible row first and then applying binary search inside that row.

The important idea is to use the matrix's ordering instead of scanning every element.
