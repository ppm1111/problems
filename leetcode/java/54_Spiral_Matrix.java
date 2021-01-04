class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> path = new ArrayList<Integer>();
        int[][] used = new int[m.length][m[0].length];
       
        matrix(path, m[0].length, m.length, 0,0,m,used);
        
        return path;
    }
    
    public void matrix(List<Integer> path, int width, int height, int x, int y,  int[][] m, int[][]used) {
        if (m[0].length == 1) {
            for (int a = 0; a < m.length; a++) {
                path.add(m[a][0]);
            }
            return;
        }
        if (m.length == 1) {
             for (int a = 0; a < m[0].length; a++) {
                path.add(m[0][a]);
            }
            return;
        }
        
        if (used[x][y] == 0) {
            path.add(m[x][y]);
            used[x][y] = 1;
        }
        
        if (path.size() >= m.length * m[0].length) {
            return;
        }
        for (int a = 1; a < width; a++) {
            if (used[x][y+a] == 0) {
                path.add(m[x][y + a]);
                used[x][y+a] = 1;
            }
        }
        for (int a = 1; a < height; a++) {
            if (used[x+a][y+width-1] == 0) {
               path.add(m[x+a][y+width-1]);
               used[x+a][y+width-1] = 1;
            }
        }
        for (int a = 1; a < width; a++) {
            if (used[x+height-1][y+width-1-a] == 0) {
                path.add(m[x+height-1][y+width-1-a]);
                used[x+height-1][y+width-1-a] = 1;
            }
        }
        for (int a = 1; a < height - 1; a++) {
            if (used[x+height-1-a][y] == 0) {
                path.add(m[x+height-1-a][y]);
                used[x+height-1-a][y] = 1;
            }
        }
        matrix(path, width - 2, height - 2, x + 1, y + 1, m, used);
    }
}