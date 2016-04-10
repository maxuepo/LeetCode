package net.xuepo.algorithm;


import java.util.List;
import java.util.ArrayList;

/**
 * Created by xuepo on 4/9/16.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();

        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                res.add(matrix[i][colStart]);
            }
            colStart++;
        }

        if (rowStart == rowEnd) {
            for (int i = colStart; i <=colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }

            return res;
        }

        if (colStart == colEnd) {
            for (int i = rowStart; i <= rowEnd; i++) {
                res.add(matrix[i][colStart]);
            }
            return res;
        }
        return res;
    }
}
