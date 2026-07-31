class Solution {
    public int largestAltitude(int[] gain) 
    {
        int cur=0;
        int high=0;
        for(int i=0;i<gain.length;i++)
        {
            cur+=gain[i];
            high=Math.max(high,cur);
        }
        return high;
    }
}