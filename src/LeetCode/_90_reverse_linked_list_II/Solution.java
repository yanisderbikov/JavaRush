package LeetCode._90_reverse_linked_list_II;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode cur_node = head;
        ListNode prev = null;
        while (cur_node != null && cur_node.val != left){
            prev = cur_node;
            cur_node = cur_node.next;
        }
        ListNode connect_from = prev;
        ListNode tail = cur_node;

        while (cur_node != null && cur_node.val != right){
            ListNode temp = cur_node.next;
            cur_node.next = prev;
            prev = cur_node;
            cur_node = temp;
        }
        if (cur_node != null) {
            ListNode toTail = cur_node.next;
            cur_node.next = prev;
            connect_from.next = cur_node;
            tail.next = toTail;
        }
        return head;
    }
}