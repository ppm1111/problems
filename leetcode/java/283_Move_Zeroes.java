class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int temp = 0;
        while(j < nums.length) {
            if (nums[j] == 0) {
                j++;
                continue;
            }
            if (i != j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            j++;
        }
    }
}