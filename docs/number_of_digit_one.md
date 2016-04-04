# Problem Statement

Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

For example:
Given n = 13,
Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.

# Solution

reference: https://leetcode.com/discuss/44281/4-lines-o-log-n-c-java-python

Use hundred-digit for example.

| hundreds-digit     | original number | higher part | lower part | total number of 1 at hundred-digit|
| --------|---------|-------|-------|-------|
| ==0 |3141092|31410|92|3141 x 100|
| ==1 |3141192|31411|92|3141 x 100 + 92 + 1|
| >=2 |3141292|31411|92|(3141 + 1) x 100|


# Code

```java
public class Solution {
    public int countDigitOne(int n) {

    }
}
```