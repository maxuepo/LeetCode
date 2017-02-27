package net.xuepo.algorithm;


import org.junit.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 2/26/17.
 */
public class EliminationGameTest extends EliminationGame {

    @Test
    public void test01() {
        int output01 = this.lastRemaining(9);
        Assert.assertEquals(output01, 6);
    }


}
