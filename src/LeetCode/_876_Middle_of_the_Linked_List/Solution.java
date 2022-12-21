package LeetCode._876_Middle_of_the_Linked_List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        //суть заключается в том, что создается быстрый и медленный.
        // один проходит до конца, а другой половину.
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
