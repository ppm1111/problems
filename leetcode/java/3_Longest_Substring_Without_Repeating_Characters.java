class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int a = 0;a<s.length();a++) {
            Map<Character, Boolean> map = new HashMap<>();
            if(s.length() == 1) {
                return 1;
            }
            int b = a;
            while(b < s.length()) {
                if(map.containsKey(s.charAt(b))) {
                    break;
                } else {
                    max = Math.max(max, b - a + 1);
                    map.put(s.charAt(b), true);
                }
                b++;
            }
        }
        return max;
    }
}