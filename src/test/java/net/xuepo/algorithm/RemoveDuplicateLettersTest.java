package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 *
 * As the solution passed LeetCode OJ, only one test case created for debugging purpose.
 */
public class RemoveDuplicateLettersTest extends RemoveDuplicateLetters {

    @Test
    public void testRemoveDuplicateLetters() throws Exception {
        String out = removeDuplicateLetters("bcabc");
        assertEquals("abc", out);
    }

}