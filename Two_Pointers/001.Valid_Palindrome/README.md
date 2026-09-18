# Valid Palindrome

## 🧩 Problem

Given a string `s`, determine whether it is a palindrome after:

* Converting uppercase letters to lowercase.
* Removing all non-alphanumeric characters.

Return `true` if the resulting string reads the same forward and backward.

### Example

**Input:**

```text
s = "A man, a plan, a canal: Panama"
```

**Output:**

```text
true
```

**Explanation:**

After removing non-alphanumeric characters and converting to lowercase:

```text
"amanaplanacanalpanama"
```

The string reads the same from both directions.

---

## 💡 Solution

I used the **two-pointer technique** with one pointer starting from the beginning and another from the end.

* `left` starts at the beginning of the string.
* `right` starts at the end.
* Non-alphanumeric characters are skipped using `Character.isLetterOrDigit()`.
* Valid characters are compared after converting them to lowercase.
* If any pair does not match, return `false`.
* If all valid characters match, return `true`.

---

## 🧠 Concepts Learned

* Two-pointer technique
* String traversal
* `charAt()`
* `Character.isLetterOrDigit()`
* `Character.toLowerCase()`
* Skipping unwanted characters
* Comparing characters from both ends
* Early return

### ⭐ Important Java Methods

```java
Character.isLetterOrDigit(ch)
```

Checks whether a character is a letter or a digit.

```java
Character.toLowerCase(ch)
```

Converts a character to lowercase.

These methods allow the palindrome check to be performed without creating a separate cleaned string.

---

## 🔍 Approach in Action

For:

```text
"A man, a plan, a canal: Panama"
```

The pointers skip spaces and punctuation:

```text
A → a
m → m
a → a
n → n
...
```

Characters are compared from both ends until the pointers meet.

---

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

Only two pointers are used, so no additional string or data structure is required.

---

## 📌 Key Takeaway

The **two-pointer technique** can solve palindrome problems efficiently by comparing elements from both ends while moving toward the center.

This problem also helped me practice Java's `Character` utility methods for handling strings and characters.

---

## 🚀 Progress

**Java DSA — Day 2**

**Problem:** Valid Palindrome
**Primary Concept:** Two Pointers
**Difficulty:** Easy