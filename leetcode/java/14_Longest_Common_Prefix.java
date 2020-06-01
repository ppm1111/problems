class Solution {
    public String longestCommonPrefix(String[] strs) {
         int start = 0;
         int min = -1;
         for(int a=0;a<strs.length;a++) {
             if(min > strs[a].length() || min == -1) {
                 min = strs[a].length();
             }
         }
         if(min == 0 || strs.length == 0) {
             return "";
         }
         char common = ' ';
         while(start != min) {
             boolean check = true;
             for(int a=0;a<strs.length;a++) {
                 if(a == 0) {
                     common = strs[a].charAt(start);
                 }else if(strs[a].charAt(start) != common){
                     check = false;
                 }
             }
             if(check == false) {
                 return strs[0].substring(0, start);
             }else{
                 start++;
             }
         }
         return strs[0].substring(0, min);
     }
 }