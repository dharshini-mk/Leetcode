class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        for(int i:nums1)
            set1.add(i);
        for(int i:nums2)
            set2.add(i);
        List<Integer> l=new ArrayList<>();
        for(int i:set1)
        {
            if(set2.contains(i))
                l.add(i);
        }
        int[] a=new int[l.size()];
        for(int i=0;i<a.length;i++)
            a[i]=l.get(i);
        return a;
    }
}