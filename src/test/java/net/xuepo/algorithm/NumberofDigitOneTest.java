package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 * As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 */
public class NumberofDigitOneTest {
    @Test
    public void testCountDigitOne() throws Exception {

        NumberofDigitOne instance = new NumberofDigitOne();
        int numOfOnes = instance.countDigitOne(3141192);

        assertEquals(2917819, numOfOnes);
    }

}