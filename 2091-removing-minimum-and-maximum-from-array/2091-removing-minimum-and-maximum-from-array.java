class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=0; i<n;i++)
        {
            if(nums[i]>nums[maxindex])
            {
                maxindex=i;
            }
            if(nums[i]<nums[minindex])
            {
                minindex=i;
            }
        }
        int l=Math.min(minindex,maxindex);
        int r=Math.max(minindex,maxindex);

        int f=r+1;
        int e=n-l;
        int both=l+1+n-r;
        return Math.min(f,Math.min(e,both));
        
    }
}