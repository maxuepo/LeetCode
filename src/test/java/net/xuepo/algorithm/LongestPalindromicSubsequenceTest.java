package net.xuepo.algorithm;


import org.testng.annotations.Test;

import static org.testng.Assert.*;


/**
 * Created by xuepo on 2/28/17.
 */
public class LongestPalindromicSubsequenceTest extends LongestPalindromicSubsequence {

    @Test
    public void longestPalindromeSubseqTest() {

        int out01 = longestPalindromeSubseq("aaab");

        System.out.println(out01);

    }
}
