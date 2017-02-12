package net.xuepo.algorithm;

import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuepo on 2/12/17.
 */
public class FindAllAnagramsInStringTest extends FindAllAnagramsInString {
    @Test
    public void findAnagramsTest() {
        String str01 = "cbaebabacd";
        String p01 = "abc";
        List<Integer> exp01 = Arrays.asList(0, 6);
        List<Integer> indices01 = findAnagrams(str01, p01);
        Assert.assertEquals(indices01, exp01);
    }
}
