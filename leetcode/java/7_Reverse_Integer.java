class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
        }
        x = Math.abs(x);
        String str = Integer.toString(x);
        String res = "";
        for(int a = str.length()-1;a>=0;a--) {
            res += str.charAt(a);
        }
        try{ 
            if(neg) {
                return -1 * Integer.parseInt(res);
            }
            return Integer.parseInt(res);
        }catch(NumberFormatException e) {
            return 0;
        }
     }
 }