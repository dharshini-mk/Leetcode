class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length,c=0;
        Set<String> set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(0<=i&&i!=j&&Math.abs(nums[i]-nums[j])==k){
                    if(!set.contains(nums[i]+"."+nums[j]) && !set.contains(nums[j]+"."+nums[i])){
                        c++;
                    }
                    set.add(nums[i]+"."+nums[j]);
                }
            }
        }
        return c;
    }
}