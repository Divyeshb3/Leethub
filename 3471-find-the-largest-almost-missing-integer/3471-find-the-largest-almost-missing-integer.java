class Solution {
    public int largestInteger(int[] nums, int k) 
    {
        int[] count=new int[51];
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            count[nums[i]]++;
        }
        if(k==1)
        {
            for(int i=0;i<n;i++)
            {
                if(count[nums[i]]==1)
                {
                    ans=Math.max(ans,nums[i]);
                }
            }
        }
        if(k==n)
        {
            for(int i=0;i<n;i++)
            {
                ans=Math.max(ans,nums[i]);
            }
        }
        if(count[nums[0]]==1)
        {
            ans=Math.max(ans,nums[0]);
        }
         if(count[nums[n-1]]==1)
        {
            ans=Math.max(ans,nums[n-1]);
        }
        return ans;
    }
}