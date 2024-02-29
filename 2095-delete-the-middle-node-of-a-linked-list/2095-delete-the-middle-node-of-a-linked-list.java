//Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }

        // head = [1,3,4,7,1,2,6]
        ListNode fast = head.next.next; // [4,7,1,2,6]
        ListNode slow = head; // [1,3,4,7,1,2,6]
        
        while(fast != null && fast.next != null){ // 2번 반복 
            fast = fast.next.next; // [1,2,6] -> [6]
            slow = slow.next; // [3,4,7,1,2,6] -> [4,7,1,2,6]
        }
        
        slow.next =  slow.next.next; // [7,1,2,6] = [1,2,6] : 7 제거 

        return head; // [1,3,4,1,2,6]
    }
}