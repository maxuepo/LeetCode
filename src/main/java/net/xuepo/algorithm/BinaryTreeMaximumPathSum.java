package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/9/16.
 */
public class BinaryTreeMaximumPathSum {


    class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }


    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int left = helper(root.left);
        int right = helper(root.right);
        int mid = root.val;
        res = Math.max(res, left + mid + right);
        maxPathSum(root.left);
        maxPathSum(root.right);
        return res;
    }


    private int helper (TreeNode root) {
        if (root == null) return 0;
        return Math.max(helper(root.left), helper(root.right)) + root.val;
    }



}
