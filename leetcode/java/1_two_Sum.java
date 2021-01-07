class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a=0;a<nums.length;a++) {
            if (map.containsKey(nums[a])) {
                return new int[] { map.get(nums[a]), a };
            }
            map.put(target - nums[a], a);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}