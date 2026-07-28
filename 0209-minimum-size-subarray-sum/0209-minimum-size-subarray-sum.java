class Solution {
    public int minSubArrayLen(int target, int[] nums)
    {
        int l=0,s=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            s+=nums[r];
            while(s>=target)
            {
                ans=Math.min(ans,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return 0;
        }
        return ans;
    }
}