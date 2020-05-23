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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int aVal = 0;
        int bVal = 0;
        int carry = 0;
        int sum = 0;
        while(a != null || b != null) {
            if(a != null) {
                aVal = a.val;
                a = a.next;
            }else{
                aVal = 0;
            }
            if(b != null) {
                bVal = b.val;
                b = b .next;
            }else{
                bVal = 0;
            }
            sum = aVal + bVal + temp.val;
            carry = sum / 10;
            temp.val = sum % 10;
            if(a != null || b != null || carry == 1) {
                temp.next = new ListNode(carry);
                temp = temp.next;
            }
        }
        return result;
    }
}