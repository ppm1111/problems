class Solution {
    public void nextPermutation(int[] nums) {
         if(nums.length <= 1) {
             return;
         }
         int closestIndex = -1;
         for(int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int it = i + 1;
                while(it < nums.length) {
                    if (closestIndex == -1) {
                        closestIndex = it;
                    }  else if (
                        nums[it] > nums[i] 
                        && nums[closestIndex] - nums[i] > nums[it] - nums[i]){
                        closestIndex = it;
                    }
                    it++;
                }
                swap(nums, i, closestIndex);
                Arrays.sort(nums,i+1,nums.length);
                break;
            }
         }
        if(closestIndex == -1) {
            Arrays.sort(nums);
        }
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}