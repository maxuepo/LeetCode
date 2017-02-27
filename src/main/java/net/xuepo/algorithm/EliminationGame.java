package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/26/17.
 */
public class EliminationGame {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
    }
}
