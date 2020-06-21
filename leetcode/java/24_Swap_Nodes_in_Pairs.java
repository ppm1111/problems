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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode preNode = null;
        boolean swap = true;
        while(temp.next != null) {
            if(swap) {
                temp = swap(temp, preNode);
                if(preNode == null) {
                    head = temp;
                }
            }
            swap = !swap;
            preNode = temp;
            temp = temp.next;
        }
        return head;
    }
    
    public ListNode swap(ListNode temp , ListNode preNode) {
        ListNode nextNode = temp.next;
        if(preNode == null) {
            temp.next = temp.next.next;
            nextNode.next = temp;
            return nextNode;
        }
        preNode.next = nextNode;
        temp.next = nextNode.next;
        nextNode.next = temp;
        return nextNode;
    }
}