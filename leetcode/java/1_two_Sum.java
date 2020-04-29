class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] r = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                r[0] = map.get(nums[i]);
                r[1] = i;
                return r;
            } else {

                map.put(target - nums[i], i);
            }
         }
        return null;
    }
}