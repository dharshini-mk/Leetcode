class Solution
{
    public int findClosestNumber(int[] nums)
    {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            a[i]=Math.abs(nums[i]);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(a[i]>a[j]||(a[i] == a[j] && nums[i] < nums[j]))
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return nums[0];
    }
}