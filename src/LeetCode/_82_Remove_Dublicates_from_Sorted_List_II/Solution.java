package LeetCode._82_Remove_Dublicates_from_Sorted_List_II;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy_head = new ListNode(0, head);
        ListNode prev = dummy_head;

        while (head != null){
            if (head.next != null && head.val == head.next.val){
                while (head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next; // в этом ключ
            }else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy_head.next;

    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
