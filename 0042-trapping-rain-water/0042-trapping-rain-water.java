class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int w=0;
        int leftmax=height[0],rightmax=height[r];
        while(l<r)
        {
            if(leftmax<rightmax)
            {
                l++;
                leftmax= Math.max(leftmax,height[l]);
                w+=leftmax-height[l];
            }
            else
            {
                r--;
                rightmax= Math.max(rightmax,height[r]);
                w+=rightmax-height[r];
            }
        }
    return w;
        
    }
}