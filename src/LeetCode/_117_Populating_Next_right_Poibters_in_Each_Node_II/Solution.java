package LeetCode._117_Populating_Next_right_Poibters_in_Each_Node_II;

public class Solution {
    public Node connect(Node root) {
        Node head = null; //head of the next level
        Node prev = null; //the leading node on the next level
        Node current = root;  //current node of current level

        while (current != null) {
            while (current != null) {
                //left
                if (current.left != null) {
                    if (prev != null) {
                        prev.next = current.left;
                    } else {
                        head = current.left;
                    }
                    prev = current.left;
                }
                //right
                if (current.right != null) {
                    if (prev != null) {
                        prev.next = current.right;
                    } else {
                        head = current.right;
                    }
                    prev = current.right;
                }
                current = current.next;
            }
            current = head;
            head = null;
            prev = null;
        }
        return root;
    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
