package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/3/16.
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
