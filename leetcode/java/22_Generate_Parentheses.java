class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        int right=n-1,left=n;
        String s = "(";
        r(res, right, left, s);
        return res;
    }
    
    public void r(List<String> res, int right, int left, String s) {
        
        if(right == 0 && left == 0) {
            res.add(s);
        } else if(right == 0) {
            r(res, right, left-1, s+")");
        }else if(right <= left){
            r(res, right-1, left, s+"(");
            r(res, right, left-1, s+")");
        }
        
    }
}