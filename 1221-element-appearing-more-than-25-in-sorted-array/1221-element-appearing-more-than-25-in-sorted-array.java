class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>=arr.length/4)
                set.add(map.get(arr[i]));
        }
        List<Integer> l=new ArrayList<>(set);
        for(int i=0;i<arr.length;i++)
        {
            if(l.get(l.size()-1)==map.get(arr[i]))
                return arr[i];
        }
        return -1;
    }
}