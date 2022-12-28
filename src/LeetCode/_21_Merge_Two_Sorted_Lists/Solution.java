package LeetCode._21_Merge_Two_Sorted_Lists;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val){
            ListNode newNext = mergeTwoLists(l1, l2.next);
            l2.next = newNext;
            return l2;
        }else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }

    }

    public ListNode mergeTwoLists2(ListNode l2, ListNode l1) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy_head = new ListNode(0);
        ListNode current = dummy_head;

        while (l2 != null && l1 != null){
            if (l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = l1 == null ? l2 : l1; // вставка последнего элемнета

        return dummy_head.next;


    }
}
