package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/27/17.
 */
public class CountNumbersWithUniqueDigitsTest extends CountNumbersWithUniqueDigits {

    @Test
    public void countNumbersWithUniqueDigitsTest() {

        int count01 = countNumbersWithUniqueDigits(2);

        Assert.assertEquals(count01, 91);

    }
}
