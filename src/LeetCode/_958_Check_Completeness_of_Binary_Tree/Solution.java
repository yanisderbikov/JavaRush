package LeetCode._958_Check_Completeness_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean isEnd = false;
        while (!queue.isEmpty()){

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    isEnd = true;
                    continue;
                }else if (isEnd && node != null){
                    return false;
                }
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return true;
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
