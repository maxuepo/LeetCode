package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 2/12/17.
 */
public class MagicalStringTest extends MagicalString {

    @Test
    public void magicalStringTest() {
        int res01 = magicalString(12);
        Assert.assertEquals(res01, 5);

        int res02 = magicalString(0);
        Assert.assertEquals(res02, 0);

        int res03 = magicalString(9999);
        Assert.assertEquals(res03, 4995);
    }
}
