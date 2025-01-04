class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(list.get(i)==0)
            {
                list2.add(arr[i]);
                list2.add(0);
            }
            else
                list2.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
            arr[i]=list2.get(i);
    }
}