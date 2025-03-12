class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        int[] temp = Arrays.copyOfRange(nums, n - k, n); // Copy last k elements
        System.arraycopy(nums, 0, nums, k, n - k); // Shift first (n-k) elements right
        System.arraycopy(temp, 0, nums, 0, k); // Copy temp back to the front
    }
}
