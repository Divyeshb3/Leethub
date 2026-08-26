class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int num : map.keySet())
        {
            if(!map.containsKey(num-1))
            {
                int count=1;
                while(map.containsKey(num+1))
                {
                    count++;
                    num++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}