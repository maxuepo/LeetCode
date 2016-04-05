package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/4/16.
 * As the solution passed LeetCode OJ, only two test cases created for debugging purpose.
 */
public class MultiplyStringsTest extends MultiplyStrings {
    @Test
    public void testMultiply() throws Exception {
        String res = multiply("240000000000000000000000000000000000000000", "80000000000000000000000000000000000000000");
        assertEquals(res, "19200000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }
}