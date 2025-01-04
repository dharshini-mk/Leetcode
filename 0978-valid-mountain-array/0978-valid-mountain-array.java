class Solution
{
    public boolean validMountainArray(int[] arr)
    {
        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(i==0)
            {
                if(arr[i]<arr[i+1])
                    continue;
                else
                    return false;
            }
            if(arr[i]<arr[i+1])
            {
                if(flag==1)
                    return false;
                else
                    continue;
            }
            else if(arr[i]==arr[i+1])
                return false;
            else
            {
                if(i==0)
                    return false;
                if(arr[i]>arr[i+1])
                {
                    flag=1;
                    continue;
                }
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}