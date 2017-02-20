package net.xuepo.algorithm;

import net.xuepo.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xuepo on 2/19/17.
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<String> temp = new ArrayList<>();

        while(!q.isEmpty()) {
            while(!q.isEmpty() && q.peek() == null) {
                temp.add("null");
                q.poll();
            }
            if(q.isEmpty()) break;
            TreeNode curr = q.poll();
            temp.add(String.valueOf(curr.val));
            q.offer(curr.left);
            q.offer(curr.right);
        }
        return String.join(",", temp);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> nodes = mapToTreeNode(data);
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = nodes.peek();
        if(root == null) return null;
        q.offer(nodes.poll());

        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            curr.left = nodes.poll();
            curr.right = nodes.poll();
            if(curr.left != null) {
                q.offer(curr.left);
            }
            if(curr.right != null) {
                q.offer(curr.right);
            }
        }
        return root;
    }

    private TreeNode resolveNode(String str) {
        try {
            return new TreeNode(Integer.valueOf(str));
        } catch(NumberFormatException e) {
            return null;
        }
    }

    private Queue<TreeNode> mapToTreeNode(String data) {
        Queue<TreeNode> nodes = new LinkedList<>();
        String[] nodeVals = data.split(",");
        if(nodeVals.length == 0) return nodes;
        for(String val : nodeVals) {
            nodes.offer(resolveNode(val));
        }
        return nodes;
    }
}
