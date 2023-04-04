package LeetCode._589_N_ary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        preorder(root, list);
        return list;
    }
    private void preorder(Node root, List<Integer> list){
        if (root == null)return;
        list.add(root.val);

        List<Node> childrens = root.children;
        for (Node child : childrens){
            preorder(child, list);
        }
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
