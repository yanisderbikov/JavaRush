package LeetCode._24_Swap_Nodes_in_Pairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)return head;
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;

        while (current.next != null && current.next.next != null){
            ListNode first_node = current.next;
            ListNode second_node = current.next.next;
            first_node.next = second_node.next;
            current.next = second_node;
            current.next.next = first_node;
            current = current.next.next;
        }
        return dummy.next;
    }
    class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
