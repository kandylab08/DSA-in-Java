# Day 2 — Valid Anagram

**LeetCode #242 — Valid Anagram**

## 🧩 Problem

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

Two strings are anagrams if they contain the same characters with the same frequencies, but possibly in a different order.

### Example

```text
Input:
s = "anagram"
t = "nagaram"

Output:
true
```

```text
Input:
s = "rat"
t = "car"

Output:
false
```

---

## 💡 Concept Learned

* Frequency Counting
* Character-to-Index Mapping
* Arrays in Java
* `charAt()`
* `Arrays.equals()`
* Constant Space Frequency Array

---

## 🧠 Solution

Since the problem contains lowercase English letters, a frequency array of size `26` is sufficient.

Each character is mapped to an index using:

```java
s.charAt(i) - 'a'
```

For example:

```text
'a' → 0
'b' → 1
'c' → 2
...
'z' → 25
```

Two frequency arrays are maintained — one for each string.

If both arrays are identical, the strings are anagrams.

---

## ⏱️ Complexity

**Time Complexity:** `O(n)`

We traverse both strings once.

**Space Complexity:** `O(1)`

The frequency arrays always contain only `26` elements, regardless of the input size.

---

## 📚 Key Takeaway

Anagrams can be identified by comparing the **frequency of every character** rather than comparing the order of characters.

This problem also demonstrates an important optimization:

> When the character set is small and known, an array can be used instead of a HashMap for frequency counting.

---

## 📁 Category

**HashMap / Frequency Counting**

> Although this solution uses an array instead of a `HashMap`, the underlying concept is frequency counting, so this problem is useful for the HashMap/Frequency category of the DSA journey.

---

**Day 2 completed 🚀**