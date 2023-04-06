package LeetCode._814_Binary_Tree_Pruning;

public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        dfs(root);
        if (root.left == null && root.right == null && root.val == 0) return null;
        return root;
    }
    private void dfs(TreeNode root){
        if (root == null) return;
        if (!containsOne(root.left)){
            root.left = null;
        }
        if (!containsOne(root.right)){
            root.right = null;
        }
        dfs(root.left);
        dfs(root.right);
    }
    private boolean containsOne(TreeNode root){
        if (root == null) return false;
        if (root.val == 1) return true;
        return containsOne(root.left) || containsOne(root.right);
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
