class Solution {
    public int pivotIndex(int[] nums) {
       int total=0;
       for(int i=0;i<nums.length;i++)
       {
           total=total+nums[i];
       }
       int lsum=0,rsum=0;
       for(int i=0;i<nums.length;i++)
       {
        rsum=total-lsum-nums[i];
        if(lsum==rsum)
        {
            return i;
        }
        lsum+=nums[i];
       }
    return -1;
    }
}