class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int value = 0;
        for (int a = 0; a < nums.length - 2; a++) {
            int i = a+1, j = nums.length - 1;
            while(i < j) {
                if(Math.abs(nums[a] + nums[i] + nums[j] - target) < min){
                    min = Math.abs(nums[a] + nums[i] + nums[j] - target);
                    value = nums[a] + nums[i] + nums[j];
                }
                if(nums[a] + nums[i] + nums[j] <= target) {
                    i++;
                }else{
                    j--;
                }
            }
        }
        return value;
    }
}