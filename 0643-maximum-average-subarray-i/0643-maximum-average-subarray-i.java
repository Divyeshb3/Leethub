class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1;
        double s=0;
        double avg=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
        }
        double max=s/k;
        while(r<nums.length-1)
        {
            s-=nums[l];
            l++;
            r++;
            s+=nums[r];
            avg=s/k;
            max=Math.max(max,avg);
        }
        return max;   
    }
}