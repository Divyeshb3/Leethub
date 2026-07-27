class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int leftsum=0,rightsum=0,sum=0;
        int r=cardPoints.length-1;
        for(int i=0;i<k;i++)
        {
            leftsum+=cardPoints[i];
        }
        int max=leftsum;
        for(int i=k-1;i>=0;i--)
        {
            rightsum+=cardPoints[r];
            r--;
            leftsum-=cardPoints[i];
            sum=rightsum+leftsum;
            max=Math.max(max,sum);
        }
        return max;
    }
}