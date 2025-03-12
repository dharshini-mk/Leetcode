class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0,c=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum==0)
                c++;                
        }
        return c;
    }
}