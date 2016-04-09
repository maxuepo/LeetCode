package net.xuepo.algorithm;


import java.util.Stack;

/**
 * Created by xuepo on 4/9/16.
 */
public class LargestRectangleinHistogram {

    public int largestRectangleArea(int[] heights) {


        Stack<Integer> stack = new Stack<>();
        Stack<Integer> width = new Stack<>();

        stack.push(0);
        width.push(0);

        int res = -1;
        int newheights = 0;
        int top = 0;

        for (int i  = 0; i <= heights.length; i++) {

            if (i < heights.length) {
                newheights = heights[i];
            } else {
                newheights = -1;
            }

            if ( stack.peek() < newheights) {
                stack.push(heights[i]);
                width.push(1);
            } else {
                int minVal = Integer.MAX_VALUE;
                int w = 0;
                while (!stack.isEmpty() && stack.peek() > newheights) {
                    top = stack.pop();
                    minVal = Math.min(minVal, top);
                    w += width.pop();
                    res = Math.max(res, w * minVal);
                }

                stack.push(newheights);
                width.push(w + 1);
            }
        }

        return res;
    }
}
