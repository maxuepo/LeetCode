# Zigzag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
Subscribe to see which companies asked this question.

# Solution

Find index map.

P <--- 2 * numRows - 2 --->  A  <--- 2 * numRows - 2 ---> H  <--- 2 * numRows - 2 --->  N
A <--- 2 * numRows - 2 - 2 * i ---> P ...


# Code

```java
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int irow = 0; irow < numRows; irow++) {
            for (int j = irow; j < s.length(); j += 2 * numRows - 2) {
                sb.append(s.charAt(j));
                if (irow != 0 && irow != numRows - 1) {
                    int midIndex = j + 2 * numRows - 2 - 2 * irow;
                    if (midIndex > 0 && midIndex < s.length()) {
                        sb.append(s.charAt(midIndex));
                    }
                }
            }
        }
        return sb.toString();
    }
}
```