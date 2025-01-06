class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>1)
                set.add(nums[i]);
        }
        for(int i:set)
            l.add(i);
        return l;
    }
}