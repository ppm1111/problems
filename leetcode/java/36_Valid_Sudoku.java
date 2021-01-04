class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int a = 0;a<board.length;a++) {
            List<Integer>simple = new ArrayList<Integer>();
            // row
            for (int b = 0;b<board[a].length;b++) {
                if (board[a][b] != '.'){
                    simple.add(board[a][b]-'a');
                }
            }
            if (isRepeat(simple)) {
                return false;
            }
           
            // column
            simple = new ArrayList<Integer>();
            for (int b = 0;b<board[a].length;b++) {
                if (board[b][a] != '.'){
                    simple.add(board[b][a]-'a');
                }
            }
            if (isRepeat(simple)) {
                return false;
            }
            
            // sub
             simple = new ArrayList<Integer>();
            int x = a/3*3;
            int y = a%3*3;
            for (int b = 0;b<board[a].length;b++) {
                if (board[x + b/3][y + b%3] != '.'){
                    simple.add(board[x + b/3][y + b%3]-'a');
                }
            }
             if (isRepeat(simple)) {
                return false;
            }
        }
        return true;
    }
    
   public boolean isRepeat(List<Integer> a) {
        Set<Integer> set = new HashSet<Integer>(a);

        if(set.size() < a.size()){
           return true;
        }
        return false;
    }
}