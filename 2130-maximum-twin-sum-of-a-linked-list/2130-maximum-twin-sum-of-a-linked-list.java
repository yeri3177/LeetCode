/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) { // 4 -> 2 -> 2 -> 3
        ListNode slow = head;
        ListNode fast = head;
        int maxVal = 0;

        /**
            4 -> 2 -> 2[slow] -> 3
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /**
            4 -> 2 -> 2 <- 3[prev]
         */
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            
            prev = slow;
            slow = nextNode;
        }

        /**
            1. head.val = 4, prev.val = 3 -> 7
            2. head.val = 2, prev.val = 2 -> 4
         */
        while (prev != null) {
            maxVal = Math.max(maxVal, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }

        return maxVal;
    }
}