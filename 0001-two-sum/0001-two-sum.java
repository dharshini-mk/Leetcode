class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int first_index = 0; first_index < nums.length; first_index++) {
            for(int second_index = first_index + 1; second_index < nums.length; second_index++) {
                if(nums[first_index] + nums[second_index] == target) {
                    int[] result = {first_index, second_index};
                    return result;
                }
            }
        }
        return null;
    }
}