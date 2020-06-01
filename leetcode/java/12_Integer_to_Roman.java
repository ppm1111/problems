class Solution {
    public String intToRoman(int num) {
        Map<Integer, String>lookup = new HashMap<>();
        lookup.put(1000,"M");
        lookup.put(900,"CM");
        lookup.put(500,"D");
        lookup.put(400,"CD");
        lookup.put(100,"C");
        lookup.put(90,"XC");
        lookup.put(50,"L");
        lookup.put(40,"XL");
        lookup.put(10,"X");
        lookup.put(9,"IX");
        lookup.put(5,"V");
        lookup.put(4,"IV");
        lookup.put(1,"I");
        
        int[] seq = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int start = 0;
        String res = "";
        while(num != 0) {
            if(num < seq[start]) {
                start++;
            }else{
                num = num - seq[start];
                res += lookup.get(seq[start]);
            } 
        }
        return res;
    }
}