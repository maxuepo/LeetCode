package net.xuepo.algorithm;

import net.xuepo.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xuepo on 2/19/17.
 */
public class TreeTraveral {

    public List<Integer> levelTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            res.add(curr.val);
            while(curr.left != null) {
                q.offer(curr.left);
            }
            while(curr.right != null) {
                q.offer(curr.right);
            }
        }
        return res;
    }
}
