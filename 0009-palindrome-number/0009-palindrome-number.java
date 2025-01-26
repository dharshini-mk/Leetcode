class Solution {
    public boolean isPalindrome(int x)
    {
        int no=x,n,sum=0;
        while(no>0)
        {
            n=no%10;
            sum=(sum*10)+n;
            no=no/10;
        }
        if(sum==x)
            return true;
        else
            return false;
    }
}