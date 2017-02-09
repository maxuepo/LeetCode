package net.xuepo.algorithm;

import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/8/17.
 */
public class RelativeRankTest extends RelativeRank {

    @Test
    public void testFindRelativeRanks() {
        int[] nums01 = {5, 4, 3, 2, 1};
        String[] res01 = findRelativeRanks(nums01);
        Assert.assertArrayEquals(res01, new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"});

        int[] nums02 = {};
        String[] res02 = findRelativeRanks(nums02);
        Assert.assertArrayEquals(res02, new String[]{});
    }
}
