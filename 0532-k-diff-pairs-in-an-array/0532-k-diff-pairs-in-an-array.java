class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; 
        Set<Integer> set = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        if (k == 0)
        {
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums)
                map.put(n, map.getOrDefault(n, 0) + 1);
            for (int val : map.keySet())
                if (map.get(val) > 1)
                    count++;
        }
        else
        {
            for (int n : nums)
                set.add(n);
            for (int val : set)
                if (set.contains(val + k))
                    count++;
        }
        return count;
    }
}
