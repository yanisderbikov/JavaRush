package LeetCode._2_TwoNumbers;


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int forward = 0;
        while (forward != 0 || l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            int sum = forward + x + y;
            forward = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummyHead.next;
    }
}
