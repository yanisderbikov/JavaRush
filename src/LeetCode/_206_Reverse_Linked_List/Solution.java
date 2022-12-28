package LeetCode._206_Reverse_Linked_List;


public class Solution {
    public ListNode reverseList(ListNode head) {
/**
 * суть алгоритма заключается в:
 * 1 - сохранить сылку на следующий элемент в котором хранится весь лист
 * 2 - поменять ссылку текущего элемнта на предыдущий элемент
 * 3 - в голову поставить
 */
        ListNode prev = null;

        while (head != null){
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;

    }
}
