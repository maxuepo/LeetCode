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

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];
        int[] freq = new int[26];
        boolean[] existsInStack = new boolean[26];

        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!stack.isEmpty() && c <= stack.peek() && cnt[stack.peek() - 'a'] != freq[stack.peek() - 'a'] && !existsInStack[c - 'a']) {
                existsInStack[stack.peek() - 'a'] = false;
                stack.pop();
            }
            if(!existsInStack[c - 'a']) {
                existsInStack[c - 'a'] = true;
                stack.push(c);
            }
            cnt[c - 'a']++;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
```