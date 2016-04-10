package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/9/16.
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {

        int m = s1.length();
        int n = s2.length();

        boolean[][] table = new boolean[m + 1][n + 1];

        table[0][0] = true;

        int i = 1;

        while(i <= m && s3.charAt(i - 1) == s1.charAt(i - 1)) {
            table[i][0] = true;
            i++;
        }

        i = 1;
        while(i <= n && s3.charAt(i - 1) == s2.charAt(i - 1)) {
            table[0][i] = true;
            i++;
        }


        for (i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (s3.charAt(i + j - 1) == s1.charAt(i) && table[i][j - 1]) {
                    table[i][j] = true;
                }

                if(s3.charAt(i + 1 - 1) == s2.charAt(j) && table[i - 1][j]) {
                    table[i][j] = true;
                }

            }
        }
        return table[m][n];
    }
}
