package net.xuepo.algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;
/**
 * Created by xuepo on 2/9/17.
 */
public class RansomNoteTest extends RansomNote {
    @Test
    public void canConstructTest() {
        Assert.assertEquals(canConstruct("a", "b"), false);
        Assert.assertEquals(canConstruct("aa", "ab"), false);
        Assert.assertEquals(canConstruct("aa", "aab"), false);
    }
}
