class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
                return i;
            if(nums[i]<target)
                return i+1;
        }
        return 0;
    }
}