class Solution {
    public String convert(String s, int numRows) {
        String res = "";
        if(s.length() <= numRows || numRows == 1) {
            return s;
        }
        for(int a = 0; a < numRows; a++) {
            int start = a;
            boolean down = true;
            if(a == 0 || a == numRows-1) {
                while(start <= s.length() -1) {
                    res = res + s.charAt(start);
                    start = start + ((numRows - 2) * 2) + 2;                 
                }
            } else {
                while(start <= s.length() -1) {
                    if(down) {
                        res = res + s.charAt(start);
                        start = start + ((numRows - 2 - a) * 2 + 1) + 1; 
                        down = false;
                    } else {
                        res = res + s.charAt(start);
                        start = start + ((a - 1) * 2 + 1) + 1; 
                        down = true;
                    }
                }
            }
            
        }
        return res;
    }
}