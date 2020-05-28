class Solution {
    public int myAtoi(String str) {
        char sign = '+';
        String number = "";
        double res = 0;
        str = str.trim();
        for(int a = 0; a<str.length();a++) {
            if(a == 0 && (str.charAt(a) == '-' || str.charAt(a) == '+')) {
                sign = str.charAt(a);
            }else if(str.charAt(a) >= '0' && str.charAt(a) <= '9'){
                number += str.charAt(a);
            }else{
                break;
            }
        }
        if(number == "") {
            return 0;
        }
        System.out.println(number);
        res = Double.parseDouble(sign+number);
      
        if(res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if(res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        
        return (int)res;
    }
}