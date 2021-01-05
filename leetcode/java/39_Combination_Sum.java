class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        solve(res, candidates, new ArrayList<Integer>(), 0, target, 0);
        return res;
    }
    
    public void solve(List<List<Integer>> res, int[] candidates, List<Integer> part, int addition, int target, int index) {
        if (target == 0) {
            return;
        }
        if (addition == target) {
            res.add( new ArrayList<Integer>(part));
            return; 
        }
        for (int a = index; a < candidates.length; a++) {
            if (addition <= target) {
                part.add(candidates[a]);
                addition += candidates[a];
                solve(res, candidates, part, addition, target, a);
                part.remove(part.size() - 1);
                addition -= candidates[a];
            }
        }
    }
}