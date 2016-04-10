package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.HashSet;
import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/10/16.
 */
public class WordBreakTest extends WordBreak{
    @Test
    public void testWordBreak() throws Exception {

        Set<String> s = new HashSet<>();

        s.add("leet");
        s.add("code");

        String input = "leetcode";


        boolean res = wordBreak(input, s);
        System.out.println(res);
    }

}