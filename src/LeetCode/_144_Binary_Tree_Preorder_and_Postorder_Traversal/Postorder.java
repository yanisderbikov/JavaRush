package LeetCode._144_Binary_Tree_Preorder_and_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            dfs(list, root);
            return list;
        }

        private void dfs(List<Integer> list, TreeNode root){
            if (root == null) return;

            dfs(list, root.left);
            dfs(list, root.right);
            list.add(root.val);
        }
    }
}
