class Solution {
    public int missingInteger(int[] nums) 
    {
        int i;
        int ans=nums[0];
        HashSet<Integer> set=new HashSet<>();
        for(i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            {
                ans+=nums[i+1];
            }
            else
            {
                break;
            }
        }
        while(set.contains(ans))
        {
            ans++;
        }
       return ans;
    }
}