class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 2; a++) {
            int i = a+1, j = nums.length - 1;
            while(nums[a] == nums[a+1] && a != nums.length - 2) {
                a++;
            }
            if(nums[a] > 0 || nums[a] + nums[i] > 0) {
                break;
            }
            while(i < j) {
                if(nums[a] + nums[i] + nums[j] == 0) {
                    listOfLists.add(new ArrayList<Integer>());
                    listOfLists.get(listOfLists.size()-1).add(nums[a]);
                    listOfLists.get(listOfLists.size()-1).add(nums[i]);
                    listOfLists.get(listOfLists.size()-1).add(nums[j]);
                    while (i < j && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j - 1]) {
                        j--;
                    }
                    i++;
                    j--;
                }else if(nums[a] + nums[i] + nums[j] < 0) {
                    i++;
                }else if(nums[a] + nums[i] + nums[j] > 0) {
                    j--;
                }
            }
        }
        return listOfLists;
    }
}