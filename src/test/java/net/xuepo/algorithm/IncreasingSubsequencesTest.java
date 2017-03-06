package net.xuepo.algorithm;


import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by xuepo on 3/5/17.
 */
public class IncreasingSubsequencesTest extends IncreasingSubsequences {

    @Test
    public void findSubsequencesTest() {
        int[] input01 = {4, 6, 7, 7};
        List<List<Integer>> res01 = findSubsequences(input01);
        for(List<Integer> lst : res01) {
            System.out.println(lst);
        }
    }

}
