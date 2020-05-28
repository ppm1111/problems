class Solution {
    public boolean isPalindrome(int x) {
         if(x < 0) {
             return false;
         }
         if(x < 10) {
             return true;
         }
         int temp = x;
         int y = 0;
         while(temp != 0) {
             y = y * 10 + temp % 10;
             System.out.println(y);
             temp = temp /10;
         }
         if(x != y) {
             return false;
         }
         return true;
     }
 }