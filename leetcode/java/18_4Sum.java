class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 3; a++) {
            if(a!=0 && nums[a]==nums[a-1])
                continue;
            for(int b = a+1; b < nums.length - 2; b++) {
                int i = b+1, j = nums.length - 1;
                if(b!=a+1 && nums[b]==nums[b-1])
                    continue;
                 while(i < j) {
                     if(nums[a] + nums[b] + nums[i] + nums[j] == target) {
                        listOfLists.add(new ArrayList<Integer>());
                        listOfLists.get(listOfLists.size()-1).add(nums[a]);
                        listOfLists.get(listOfLists.size()-1).add(nums[b]);
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
                     }else if(nums[a] + nums[b] + nums[i] + nums[j] < target) {
                        i++;
                    }else {
                        j--;
                    }
                 }
            }
        }
        return listOfLists;
    }
}