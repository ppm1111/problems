class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length - 1) {
            if (nums[j] != nums[j+1])  {
                i++;
                nums[i] = nums[j+1];
            }
            j++;
        }
        return i+1;
    }
}