# Day 3 — Group Anagrams

**Problem:** Group Anagrams
**Platform:** LeetCode
**Language:** Java
**Category:** Hashing / HashMap

## Problem

Given an array of strings `strs`, group the anagrams together.

Anagrams are strings that contain the same characters with the same frequencies, but possibly in a different order.

### Example

```text
Input:
["eat","tea","tan","ate","nat","bat"]

Output:
[["eat","tea","ate"],["tan","nat"],["bat"]]
```

## Solution

The key idea is to create a common pattern for every anagram.

For each string:

1. Convert the string into a character array.
2. Sort the characters.
3. Convert the sorted character array back into a string.
4. Use this sorted string as the `HashMap` key.
5. Store the original string in the list associated with that key.

### Example

```text
eat → aet
tea → aet
ate → aet

tan → ant
nat → ant

bat → abt
```

Therefore, strings producing the same sorted pattern belong to the same anagram group.

## Java Concepts Learned

* `HashMap`
* `ArrayList`
* `Map`
* `char[]`
* `String.toCharArray()`
* `Arrays.sort()`
* `new String(char[])`
* `Map.values()`

## Complexity

Let:

* `n` = number of strings
* `k` = maximum length of a string

**Time Complexity:** `O(n × k log k)`

Each string's characters are sorted individually.

**Space Complexity:** `O(n × k)`

The HashMap stores the anagram groups and their strings.

## Key Learning

The main takeaway from this problem is that **anagrams can be identified using a common representation**.

Sorting the characters gives every group of anagrams the same key, allowing a `HashMap` to efficiently group them together.

## Day 3 Completed.
