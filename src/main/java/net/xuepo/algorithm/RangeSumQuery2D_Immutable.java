package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/10/16.
 */
public class RangeSumQuery2D_Immutable {


    int[][] accu;

    public RangeSumQuery2D_Immutable(int[][] matrix) {
        this.accu = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                accu[i][j] += getAccValue(i - 1, j) + getAccValue(i, j - 1) - getAccValue(i - 1, j - 1);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return getAccValue(row2, col2)
                - getAccValue(row1 - 1, col2)
                - getAccValue(row2, col1 - 1)
                + getAccValue(row1 - 1, col1 - 1);
    }

    int getAccValue(int i, int j) {
        return i >= 0 && j >= 0 ? accu[i][j] : 0;
    }
}