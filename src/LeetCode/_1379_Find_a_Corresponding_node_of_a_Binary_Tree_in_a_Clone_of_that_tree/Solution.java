package LeetCode._1379_Find_a_Corresponding_node_of_a_Binary_Tree_in_a_Clone_of_that_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    //    this is a BFS

    public final TreeNode getTargetCopy(final TreeNode original,
                                        final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> o_qeque = new ArrayDeque<>();//the same with Stack but preferable
        Deque<TreeNode> c_qeque = new ArrayDeque<>();
        o_qeque.offer(original);
        c_qeque.offer(cloned);

        while (!o_qeque.isEmpty()){
            TreeNode o_node = o_qeque.poll();
            TreeNode c_node = c_qeque.poll();

            if (o_node == target){
                return c_node;
            }

            if (o_node.left != null){
                o_qeque.offer(o_node.left);
                c_qeque.offer(c_node.left);
            }

            if (o_node.right != null){
                o_qeque.offer(o_node.right);
                c_qeque.offer(c_node.right);
            }

        }
        return null;

    }
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) {
             val = x;
         }
    }
}
