# Problem Statment
Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

## Example:
Given "bcabc"
Return "abc"

Given "cbacdcbc"
Return "acdb"

# Solution

## Use Stack
* Create a array to store the frequency of chars in the string.
* Iterate the String and try to push char in string to the stack.
* For new char, check if
* 1. it does not exists in the stack.
* 2. it is smaller than the stack top.
* 3. the stack top has remaining in the count array.
* If the above conditions are satisfied, pop the stack and push the new char into stack.
* repeating this until all unique are pushed into stack.
* pop stack to create a string; reverse the string to get result.

# Code

```java
public class Solution {
    public String removeDuplicateLetters(String s) {

    }
}
```