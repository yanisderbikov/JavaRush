package LeetCode._572_Subtree_of_Another_Tree;

public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root != null){
            if (cheack(root, subRoot)){
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        return false;
    }

    boolean cheack(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val == subRoot.val){
            return cheack(root.left, subRoot.left) && cheack(root.right, subRoot.right);
        }
        return false;
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
