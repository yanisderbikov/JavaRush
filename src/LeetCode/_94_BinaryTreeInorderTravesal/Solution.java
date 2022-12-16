package LeetCode._94_BinaryTreeInorderTravesal;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
       return null;

    }

    public List<Integer> preOrder(TreeNode root, List<Integer> nums){

//        if (root == null) return;
        nums.add(root.children().hashCode());
//        cant understand why i cant take 'root.val' ???
//        preOrder(root.)

    }




}
//Preorder: Node -> Left -> Right
//public void preorder(TreeNode root, List<Integer> nums) {
//  if (root == null) return;
//  nums.add(root.val);
//  preorder(root.left, nums);
//  preorder(root.right, nums);
//}

//Inorder : Left -> Node -> Right
//public void inorder(TreeNode root, List<Integer> nums) {
//  if (root == null) return;
//  inorder(root.left, nums);
//  nums.add(root.val);
//  inorder(root.right, nums);
//}

//Postorder : Left -> Right -> Node
//    public void postorder(TreeNode root, List<Integer> nums) {
//        if (root == null) return;
//        postorder(root.left, nums);
//        postorder(root.right, nums);
//        nums.add(root.val);
//    }
