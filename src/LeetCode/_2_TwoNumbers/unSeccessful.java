package LeetCode._2_TwoNumbers;

import java.util.Stack;

public class unSeccessful {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        ListNode result = new ListNode(0);
        ListNode ans = result;

        while (l1 != null){
            first.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            second.push(l2.val);
            l2 = l2.next;
        }
        int f = 0;
        while (!first.isEmpty()){
            f *= 10;
            f += first.pop() * 10;
        }
        f /= 10;
        int s = 0;
        while (!second.isEmpty()){
            s *= 10;
            s += second.pop() * 10;
        }
        s /= 10;

        int res = f + s;
        while (res != 0){
            result.next = new ListNode(res % 10);
            res /= 10;
            result = result.next;
        }

        return ans.next == null ? ans : ans.next;
    }
}
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
