package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/11/17.
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;

        int[] res = new int[m * n];

        int row = 0;
        int col = 0;

        boolean direction = false;
        for(int i = 0; i < m * n; i++) {
            res[i] = matrix[row][col];
            if(direction) {
                col -= 1;
                row += 1;
            } else {
                col += 1;
                row -= 1;
            }

            if(row >= m){
                row = m - 1;
                col += 2;
                direction = !direction;
            }

            if(col >= n) {
                col = n - 1;
                row += 2;
                direction = !direction;
            }

            if(row < 0) {
                row = 0;
                direction = !direction;
            }

            if(col < 0 ) {
                col = 0;
                direction = !direction;
            }
        }

        return res;
    }
}
