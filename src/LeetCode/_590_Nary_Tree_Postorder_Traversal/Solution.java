package LeetCode._590_Nary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        postorder(list, root);
        list.add(root.val);
        return list;
    }
    private void postorder(List<Integer> list, Node root){
        if (root == null) return;

        List<Node> childrens = root.children;
        for (Node child : childrens){
            postorder(list, child);
            list.add(child.val);
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
