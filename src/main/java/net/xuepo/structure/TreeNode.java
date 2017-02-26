package net.xuepo.structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xuepo on 2/19/17.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }


    // TODO: LOGIC DUPLICATED.
    public static List<List<String>> levelTraversal(TreeNode root) {
        List<List<String>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<String> temp = new ArrayList<>();
        int count = 1;
        int nextCount = 0;
        while(!q.isEmpty()) {
            while(!q.isEmpty() && q.peek() == null) {
                temp.add("na");
                q.poll();
            }
            if(q.isEmpty()) break;

            TreeNode curr = q.poll();
            count--;
            temp.add(String.valueOf(curr.val));

            q.offer(curr.left);
            nextCount++;

            q.offer(curr.right);
            nextCount++;

            if(count == 0) {
                res.add(new ArrayList<>(temp));
                temp = new ArrayList<>();
                count = nextCount;
                nextCount = 0;
            }
        }
        return res;
    }

    public static void displayTree(TreeNode root) {
        List<List<String>> nodeLists = levelTraversal(root);
        for(List<String> level : nodeLists) {
            System.out.println(level);
        }
    }
}
