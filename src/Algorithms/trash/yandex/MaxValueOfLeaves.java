package Algorithms.trash.yandex;

public class MaxValueOfLeaves {

    int maxValueOfLeave(TreeNode root) {
        if (root == null) return 0;
        return root.val + Math.max(maxValueOfLeave(root.left), maxValueOfLeave(root.right));
    }
}
