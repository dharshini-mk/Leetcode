class Solution {
    public int findNumbers(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int no,n=0;
            while(x!=0)
            {
                no=x/10;
                n++;
                x=x/10;
            }
            if(n%2==0)
                m++;
        }
        return m;
    }
}