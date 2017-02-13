package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/12/17.
 */
public class TotalHammingDistanceTest extends TotalHammingDistance {

    @Test
    public void totalHammingDistanceTest() {
        int[] testCase01 = {4, 14, 2};
        int res01 = totalHammingDistance(testCase01);
        Assert.assertEquals(res01, 6);
    }
}
