package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/28/17.
 */
public class PerfectSquaresTest extends PerfectSquares {

    @Test
    public void test01() {

        int res01 = numSquares(1);
        Assert.assertEquals(res01, 1);

        int res02 = numSquares(23);
        Assert.assertEquals(res02, 4);

    }
}
