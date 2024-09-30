class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            // Define the maximum index for j based on k
            for (int j = i + 1; j <= Math.min(i + k, nums.length - 1); j++) {
                // Check if the numbers are equal
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate within the range
                }
            }
        }
        return false; // No duplicates found within the range
    }
}
