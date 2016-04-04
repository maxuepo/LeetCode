package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/3/16.
 */
public class NumberofDigitOne {
    public int countDigitOne(int n) {
        int numberOfOnes = 0;
        for (long i = 1; i <= n; i *= 10) {
            long a = n / i;
            long b = n % i;
            numberOfOnes += ((a + 8) / 10) * i;
            if (a % 10 == 1) numberOfOnes += b + 1;
        }
        return numberOfOnes;
    }
}
