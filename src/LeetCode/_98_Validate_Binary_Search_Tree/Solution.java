package LeetCode._98_Validate_Binary_Search_Tree;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);

    }

    boolean check(TreeNode root, Integer minVal, Integer maxVal){
        if (root == null) return true;
        if (minVal != null && root.val <= minVal ||
                (maxVal != null && root.val >= maxVal) ) return false;

        return check(root.right, root.val, maxVal) && check(root.left, minVal, root.val);

    }
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

