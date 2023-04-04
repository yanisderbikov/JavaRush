package LeetCode._404_Sum_of_Left_Leaves;

public class Solution {
    static int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        count(root, false);
        return sum;
    }
    private void count(TreeNode root, boolean isLeft) {
        if (root == null) return;
        if (isLeft) sum += root.val;
        count(root.left, true);
        count(root.right, false);
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
