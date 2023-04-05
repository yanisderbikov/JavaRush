package LeetCode._515_Find_Largest_Value_in_Tree_Row;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode forward = head.next;
        ListNode last = head;
        ListNode link_forward = forward;

        while (forward != null && forward.next != null){
            last.next = forward.next;
            last = last.next;
            forward.next = last.next;
            forward = forward.next;
        }

        last.next = link_forward;
        return head;
    }
    class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
