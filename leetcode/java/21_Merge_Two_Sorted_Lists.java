public class 21_Merge_Two_Sorted_Lists {
    
}class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode temp1 = null;
        ListNode temp2 = null;
        
        if(l1.val > l2.val) {
            temp1 = l2;
            temp2 = l1;
        }else{
            temp1 = l1;
            temp2 = l2;
        }
        while(temp1.next != null && temp2 != null) {
            if(temp1.next.val >= temp2.val) {
                ListNode new1 = new ListNode();
                new1.val = temp2.val;
                new1.next = temp1.next;
                
                temp1.next = new1;
                temp2=temp2.next;
                temp1=temp1.next;
            }else {
                temp1=temp1.next;
            }
        }
        
        while(temp2 != null) {
            ListNode new1 = new ListNode();
            new1.val = temp2.val;
            new1.next = null;
            
            temp1.next = new1;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        if(l1.val > l2.val) {
            return l2;
        }else{
            return l1;
        }
    }
}