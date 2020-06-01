class Solution {
    public int romanToInt(String s) {
        int a = 0;
        int res = 0;
        Map<String, Integer>lookup = new HashMap<>();
        lookup.put("M",1000);
        lookup.put("CM",900);
        lookup.put("D",500);
        lookup.put("CD",400);
        lookup.put("C",100);
        lookup.put("XC",90);
        lookup.put("L",50);
        lookup.put("XL",40);
        lookup.put("X",10);
        lookup.put("IX",9);
        lookup.put("V",5);
        lookup.put("IV",4);
        lookup.put("I",1);
        while(a != s.length()) {
            if(a == s.length() - 1) {
                res += lookup.get(String.valueOf(s.charAt(a)));
                break;
            }
            if(s.charAt(a) == 'C' && s.charAt(a+1) == 'M') {
                res += lookup.get("CM");
                a=a+2;
            }else if(s.charAt(a) == 'C' && s.charAt(a+1) == 'D') {
                res += lookup.get("CD");
                a=a+2;
            }else if(s.charAt(a) == 'X' && s.charAt(a+1) == 'C') {
                res += lookup.get("XC");
                a=a+2;
            }else if(s.charAt(a) == 'X' && s.charAt(a+1) == 'L') {
                res += lookup.get("XL");
                a=a+2;
            }else if(s.charAt(a) == 'I' && s.charAt(a+1) == 'X') {
                res += lookup.get("IX");
                a=a+2;
            }else if(s.charAt(a) == 'I' && s.charAt(a+1) == 'V'){
                res += lookup.get("IV");
                a=a+2;
            }else{
                res += lookup.get(String.valueOf(s.charAt(a)));
                a++;
            }
        }
        return res;
    }
}