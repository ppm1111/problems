class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                temp = map.get(s.charAt(i));
                map.put(s.charAt(i), temp + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
          if (map.get(s.charAt(i)) == 1) {
              return i;
          } 
        }
        return -1;
    }
}