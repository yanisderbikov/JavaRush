package LeetCode._147_Intertion_Sort_List;

public class Solution_TL {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode dummy = head;
        while (head != null){
            set(dummy, head);
            head = head.next;
        }
        return dummy;
    }
    private void set(ListNode dummy, ListNode cur){
        ListNode head = dummy;
        if (cur.val < head.val) {
            cur.next = head;
            head = cur;
            return;
        }

        while (head.next != null){
            ListNode prev_node = head;
            ListNode next_node = head.next;
            if (next_node != null && prev_node.val <= cur.val && cur.val <= next_node.val){
                cur.next = next_node;
                prev_node.next = cur;
                return;
            }
            if (next_node == null){
                head.next = cur;
                return;
            }
            head = head.next;
        }
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
