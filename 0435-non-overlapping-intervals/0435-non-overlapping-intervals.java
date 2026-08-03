class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int c=0;
        int prevend=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(prevend<=intervals[i][0])
            {
                prevend=intervals[i][1];
            }
            else
            {
                c++;
            }
        }
        return c;
    }
}