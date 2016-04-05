package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/4/16.
 *  As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 *
 */
public class ZigZagConversionTest extends ZigZagConversion {
    @Test
    public void testConvert() throws Exception {
        String res = convert("PAYPALISHIRING", 3);
        assertEquals(res, "PAHNAPLSIIGYIR");
    }

}