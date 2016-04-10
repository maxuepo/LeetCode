package net.xuepo.algorithm;

import java.util.Stack;

/**
 * Created by xuepo on 4/9/16.
 */
public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = m == 0?0:matrix[0].length;

        int[][] heights = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j]== '0') {
                    heights[i][j] = 0;
                } else {
                    heights[i][j] = i == 0?1:heights[i - 1][j] + 1;
                }
            }
        }

        int res = -1;
        for (int i = 0; i < m; i++) {
            int tmp = maxHistArea(heights[i]);
            res = Math.max(res, tmp);
        }
        return res;
    }

    private int maxHistArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int maxArea = 0;
        while(i < height.length){
            if(stack.isEmpty() || height[stack.peek()] <= height[i]){
                stack.push(i++);
            }else {
                int t = stack.pop();
                maxArea = Math.max(maxArea, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return maxArea;
    }
}
