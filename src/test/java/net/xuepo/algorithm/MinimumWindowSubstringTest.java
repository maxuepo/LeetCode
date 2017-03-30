package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 3/17/17.
 */
public class MinimumWindowSubstringTest extends MinimumWindowSubstring {

    @Test
    public void test() {

        String source01 = "ADOBECODEBANC";
        String target01 = "BANC";

        String substring01 = minWindow(source01, target01);

        System.out.println(substring01);

    }
}
