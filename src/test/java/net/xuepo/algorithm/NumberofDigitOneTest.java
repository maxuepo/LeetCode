package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 * As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 */
public class NumberofDigitOneTest extends NumberofDigitOne {
    @Test
    public void testCountDigitOne() throws Exception {

        int numOfOnes = countDigitOne(3141192);

        assertEquals(2917819, numOfOnes);
    }

}