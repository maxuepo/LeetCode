# Count Bits

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].

# Solution
to be added.


# Code

```java
public class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegative = num < 0 ? true : false;
        num = Math.abs(num);
        int base = 7;
        StringBuffer sb = new StringBuffer();
        while(num != 0) {
            int digit = num % base;
            num /= base;
            sb.append(digit);
        }
        if(isNegative) sb.append("-");
        return sb.reverse().toString();
    }
}
```