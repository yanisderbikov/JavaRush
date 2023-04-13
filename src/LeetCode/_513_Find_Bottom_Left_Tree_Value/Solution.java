package LeetCode._513_Find_Bottom_Left_Tree_Value;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
