class Solution {
    public int missingInteger(int[] nums) 
    {
        int ans = nums[0];
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] + 1 == nums[i + 1])
            {
                ans += nums[i + 1];
            }
            else
            {
                break;
            }
        }
        while(true)
        {
            boolean found = false;

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == ans)
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                return ans;
            }

            ans++;
        }
    }
}