package net.xuepo.algorithm;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.List;


import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/10/16.
 */
public class WordBreakIITest extends WordBreakII {
    @Test
    public void testWordBreak() throws Exception {


        String s = "catsanddog";

        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");

        List<String> res = wordBreak(s, dict);

        System.out.println(res);

    }

}