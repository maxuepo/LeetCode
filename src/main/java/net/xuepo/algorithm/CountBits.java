package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/3/16.
 *
 * Statement:
 * Given a non negative integer number num.
 * For every numbers i in the range 0 ≤ i ≤ num calculate
 * the number of 1's in their binary representation and
 * return them as an array.
 *
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
