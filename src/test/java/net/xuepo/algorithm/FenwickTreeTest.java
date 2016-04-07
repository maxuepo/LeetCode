package net.xuepo.algorithm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuepo on 4/6/16.
 */
public class FenwickTreeTest extends FenwickTree {


    int[] arry = {1,2,3,4,5,6,7,8,100};

    FenwickTree ft = new FenwickTree(arry);

    @Test
    public void testLowbit() throws Exception {
        assertEquals(lowbit(8), 8);
        assertEquals(lowbit(4), 4);
        assertEquals(lowbit(3), 1);
        assertEquals(lowbit(6), 2);
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(ft.sum(1), 1);
        assertEquals(ft.sum(2), 3);
        assertEquals(ft.sum(3), 6);
        assertEquals(ft.sum(3), 6);
        assertEquals(ft.sum(8), 36);
        assertEquals(ft.sum(8), 136);

    }
}