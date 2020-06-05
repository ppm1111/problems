class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
        for(int a = 0; a < s.length(); a++) {
            if(s.charAt(a) == '(' || s.charAt(a) == '{' || s.charAt(a) == '[') {
                st.push(s.charAt(a));
            }else{
                if(st.empty()) {
                    return false;
                }
                char pop = (char)st.pop();
                if( (s.charAt(a) == ')' && pop != '(')
                  || (s.charAt(a) == ']' && pop != '[')
                  || (s.charAt(a) == '}' && pop != '{')) {
                 return false;
                }
            }
        }
        return st.empty();
    }
}