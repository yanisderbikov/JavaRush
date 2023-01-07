package LeetCode._100_Same_tree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null ) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         // p and q are both null
//         if (p == null && q == null) return true;
//         // one of p and q is null
//         if (q == null || p == null) return false;
//         if (p.val != q.val) return false;
//         return isSameTree(p.right, q.right) &&
//                 isSameTree(p.left, q.left);
//     }
