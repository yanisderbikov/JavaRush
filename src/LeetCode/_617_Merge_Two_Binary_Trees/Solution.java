package LeetCode._617_Merge_Two_Binary_Trees;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode nNode = new TreeNode(root1.val + root2.val);

        nNode.left = mergeTrees(root1.left, root2.left);
        nNode.right = mergeTrees(root1.right, root2.right);

        return nNode;

    }
}
