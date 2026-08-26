class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> unique=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                unique.add(nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        unique.sort((a,b)->map.get(b)-map.get(a));
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=unique.get(i);
        }
        return ans;
    }
}