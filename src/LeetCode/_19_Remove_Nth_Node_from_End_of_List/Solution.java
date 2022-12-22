package LeetCode._19_Remove_Nth_Node_from_End_of_List;


public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        ListNode fast = dummy_head;
        ListNode slow = dummy_head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy_head.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
