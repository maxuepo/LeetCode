package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by xuepo on 2/15/17.
 */
public class IntegerBreakTest extends IntegerBreak {

    @Test
    public void integerBreakTest() {

        int out01 = integerBreak(2);
        Assert.assertEquals(out01, 1);

        int out02 = integerBreak(9);
        Assert.assertEquals(out02, 27);

        int out03 = integerBreak(58);
        Assert.assertEquals(out03, 1549681956);
    }


}
