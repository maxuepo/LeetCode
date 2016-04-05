package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/4/16.
 */
public class ZigZagConversion {
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
