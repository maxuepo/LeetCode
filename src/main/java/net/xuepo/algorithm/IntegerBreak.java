package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/15/17.
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        int res = 1;
        while(n > 4) {
            res *= 3;
            n -= 3;
        }
        res *= n;
        return res;
    }
}
