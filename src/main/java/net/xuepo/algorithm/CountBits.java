package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/3/16.
 * docs: https://github.com/maxuepo/leetcode/blob/master/docs/count_bits.md
 */

public class CountBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = i % 2 + res[i/2];
        }
        return res;
    }
}
