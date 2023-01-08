package LeetCode._559_Maximum_Depth_of_Nary_Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                for (Node child : currentNode.children) {
                    queue.offer(child);
                }
            }

            depth++;
        }

        return depth;
    }

//------------------------------------------
    int result = 0;

    public int maxDepth2(Node root) {

        fill(root, 0);
        return result;

    }

    void fill(Node root, int depth) {
        if (root == null) return;

        depth++;
        result = Math.max(depth, result);

        for (Node child : root.children) {
            fill(child, depth);
        }

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
}
