class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int m=nums1.length,n=nums2.length,i,j;
        int o=m+n;
        int a[]=new int[o];
        for(i=0;i<m;i++)
            a[i]=nums1[i];
        for(j=0;j<n;j++)
        {
            if(i<o)
                a[i]=nums2[j];
            i++;
        }
        Arrays.sort(a);
        if(o%2==0)
        {
            int t=o/2;
            return Math.ceil(a[t]+a[t-1])/2;
        }
        else 
            return a[o/2];
    }
}