class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++)
                sum += nums[j];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }
}

