class Solution {
    public String countAndSay(int n) {
        String s = "";
        for (int a=0;a<n;a++) {
            s = solve(s);
        }
        return s;
    }
    public String solve(String s) {
        if (s.equals("")) {
            return "1";
        }
        if (s.equals("1")) {
            return "11";
        }
        int count = 1;
        String r = "";
        char compare = '\0';
        for (int a=0;a<s.length();a++){
            if (compare == '\0') {
                compare = s.charAt(a);
                continue;
            } 
            if (s.charAt(a) == compare) {
                count++;
            } else {
                r = r + count + compare;
                compare = s.charAt(a);
                count = 1;
            }
        }
         r = r + count + compare;
        return r;
    }
}