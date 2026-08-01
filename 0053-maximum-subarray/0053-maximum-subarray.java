class Solution {
    public int maxSubArray(int[] nums) 
    {
        int s=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            maxsum = Math.max(maxsum,s);
            if(s<0)
            {
                s=0;
            }
        }
        return maxsum;
        
    }
}