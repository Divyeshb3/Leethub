class Solution {
    public int maxProduct(int[] nums) 
    {
        int prefix=0;
        int suffix=0;
        int maxprod=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0)
            {
                prefix=1;
            }
            if(suffix==0)
            {
                suffix=1;
            }
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            maxprod=Math.max(maxprod,Math.max(prefix,suffix));
        }
        return maxprod;
    }
}