class Solution {
    public int countNegatives(int[][] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(nums[i][j]<0)
                    c++;
            }
        }
        return c;
    }
}