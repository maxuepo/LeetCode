package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 2/7/17.
 */
public class KeyboardRowTest extends KeyboardRow {
    @Test
    public void test(){
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = findWords(input);
        Assert.assertEquals(output.length, 2);
        Assert.assertEquals(output[0], "Alaska");
        Assert.assertEquals(output[1], "Dad");
    }
}
