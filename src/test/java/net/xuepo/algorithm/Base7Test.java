package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Queue;

/**
 * Created by xuepo on 2/13/17.
 */
public class Base7Test extends Base7 {

    @Test
    public void convertToBase7Test() {
        String out01 = convertToBase7(-7);
        Assert.assertEquals(out01, "-10");

        String out02 = convertToBase7(100);
        Assert.assertEquals(out02, "202");
    }
}
