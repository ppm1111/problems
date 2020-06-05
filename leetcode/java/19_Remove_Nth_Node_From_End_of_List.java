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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        
        temp = head;
        length = length - n;
        if(length == 0) {
            head = temp.next;
        }else{
            while(length != 0) {
                length--;
                if(length == 0) {
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
        
        return head;
    }
}