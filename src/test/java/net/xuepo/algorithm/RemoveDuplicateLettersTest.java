package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 *
 * As the solution passed LeetCode, only one test case created for debugging purpose.
 */
public class RemoveDuplicateLettersTest {

    @Test
    public void testRemoveDuplicateLetters() throws Exception {
        RemoveDuplicateLetters instance = new RemoveDuplicateLetters();
        String out = instance.removeDuplicateLetters("bcabc");
        assertEquals("abc", out);
    }

}