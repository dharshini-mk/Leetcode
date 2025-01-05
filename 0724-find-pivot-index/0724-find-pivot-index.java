class Solution {
    public int pivotIndex(int[] nums) {
        int s=0,l=0;
        for(int i=0;i<nums.length;i++)
            s+=nums[i];
        for(int i=0;i<nums.length;i++)
        {
            if(l==s-l-nums[i])
                return i;
            l+=nums[i];
        }
        return -1;
    }
}