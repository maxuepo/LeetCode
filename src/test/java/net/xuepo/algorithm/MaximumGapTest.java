package net.xuepo.algorithm;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 3/26/17.
 */
public class MaximumGapTest extends MaximumGap {

    @Test
    public void maximumGapTest() {
        int[] input01 = {100,3,2,1};
        int output01 = maximumGap(input01);
        System.out.println(output01);
    }
}
