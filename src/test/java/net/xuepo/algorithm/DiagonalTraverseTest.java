package net.xuepo.algorithm;

import org.junit.Assert;
import org.testng.annotations.Test;
/**
 * Created by xuepo on 2/11/17.
 */
public class DiagonalTraverseTest extends DiagonalTraverse {
    int[][] mat01 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[] expected01 = {1, 2, 4, 7, 5, 3, 6, 8, 9};

    int[][] mat02 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    int[] expected02 = {1, 2, 5, 9, 6, 3, 4, 7, 10, 13, 14, 11, 8, 12, 15, 16};

    @Test
    public void findDiagonalOrderTest() {
        int[] out01 = findDiagonalOrder(mat01);
        Assert.assertArrayEquals(out01, expected01);

        int[] out02 = findDiagonalOrder(mat02);
        Assert.assertArrayEquals(out02, expected02);
    }
}
