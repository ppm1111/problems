// bfs + queue
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int total = isConnected.length;
        int[] all = new int[total];
        Queue<Integer> q = new LinkedList<Integer>();
        
        int c = 0;
        for (int b=0;b<total;b++) {
            if (all[b] == 0) {
                c++;
                q.offer(b);
                while(!q.isEmpty()) {
                    int pop = q.poll();
                    for (int a=0;a<total;a++) {
                        if (pop != a && isConnected[pop][a] == 1 && all[a]==0) {
                            q.offer(a);
                            all[a] = 1;
                        }
                    }
                }
            }
        }
        return c;
    }
}