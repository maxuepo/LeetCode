package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/3/16.
 */
public class RemoveDuplicateLettersTest {


    @Test
    public void testRemoveDuplicateLetters() throws Exception {

        RemoveDuplicateLetters instance = new RemoveDuplicateLetters();

        String out = instance.removeDuplicateLetters("aiabbcia");

        System.out.println(out);

    }

}