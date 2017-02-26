package net.xuepo.algorithm;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/26/17.
 */
public class DetectCapitalTest extends DetectCapital {

    @Test
    public void detectCapitalUseTest() {

        String str01 = "USA";
        boolean res01 = detectCapitalUse(str01);
        Assert.assertEquals(res01, true);

        String str02 = "Boolean";
        boolean res02 = detectCapitalUse(str02);
        Assert.assertEquals(res02, true);

        String str03 = "BFadf";
        boolean res03 = detectCapitalUse(str03);
        Assert.assertEquals(res03, false);

    }
}
