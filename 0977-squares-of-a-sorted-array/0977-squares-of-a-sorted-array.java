class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int n=nums.length;
        int r=n-1,k=n-1;
        int[] res=new int[n];
        while(l<=r)
        {
            if(Math.abs(nums[l])<Math.abs(nums[r]))
            {
                res[k]=nums[r]*nums[r];
                r--;
            }
            else
            {
                res[k]=nums[l]*nums[l];
                l++;
            }
            k--;
        } 
        return res; 
    }
    
}