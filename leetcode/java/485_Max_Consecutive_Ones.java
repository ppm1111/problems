class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                total++;
            } else {
                total = 0;
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
}