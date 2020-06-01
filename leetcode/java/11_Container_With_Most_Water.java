class Solution {
    public int maxArea(int[] height) {
        if(height.length <= 1) {
            return 0;
        }
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(r != l) {
            int water = 0;
            if(height[l] > height[r]) {
                water = height[r] * (r-l);
            }else{
                water = height[l] * (r-l);
            }
            if(max < water) {
                max = water;
            }
            if(height[r] > height[l]) {
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}