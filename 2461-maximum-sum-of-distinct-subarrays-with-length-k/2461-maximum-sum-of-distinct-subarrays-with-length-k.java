class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=k-1;
        long s=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        long max=0;
        if(map.size()==k)
        {
            max=s;
        }
        
        while(r<nums.length-1)
        {
            s-=nums[l];
            map.put(nums[l],map.getOrDefault(nums[l], 0) - 1);
            if(map.get(nums[l])==0)
            {
                map.remove(nums[l]);
            }
            l++;
            r++;
            s+=nums[r];
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.size()==k)
            {
                max=Math.max(max,s);
            }
        }
        return max;
    }
}