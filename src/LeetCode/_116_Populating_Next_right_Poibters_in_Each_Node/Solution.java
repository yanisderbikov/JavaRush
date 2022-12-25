package LeetCode._116_Populating_Next_right_Poibters_in_Each_Node;

public class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node current = root;
        while (current.left != null){
            Node temp = current;
            while (current != null){

                current.left.next = current.right;
                current.right.next = current.next == null ? null : current.next.left;
                current = current.next;

            }
            current = temp.left;
        }
        return root;
    }
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
}
