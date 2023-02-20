package LeetCode._110_Balanced_Binary_Tree;

public class ArentRealized {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left, 0) - depth(root.right, 0)) <= 1;
    }
    private int depth(TreeNode node, int dep){
        if (node == null) return dep;
        return Math.max(depth(node.left, dep), depth(node.right, dep) + 1);
    }
     public class TreeNode {
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
