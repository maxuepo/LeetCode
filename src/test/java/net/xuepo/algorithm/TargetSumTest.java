package net.xuepo.algorithm;

import java.util.List;

import org.testng.annotations.Test;

/**
 * Created by xuepo on 2/15/17.
 */
public class TargetSumTest extends TargetSum {

    @Test
    public void findTargetSumWaysTest() {
        int[] nums01 = {1, 0};
        int S1 = 1;

        int out01 = findTargetSumWays(nums01, S1);
        System.out.println(out01);

    }
}
