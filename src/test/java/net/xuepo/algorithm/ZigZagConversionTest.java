package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/4/16.
 *  As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 *
 */
public class ZigZagConversionTest {
    @Test
    public void testConvert() throws Exception {
        ZigZagConversion instance = new ZigZagConversion();
        String res = instance.convert("PAYPALISHIRING", 4);
        assertEquals(res, "PAHNAPLSIIGYIR");
    }

}