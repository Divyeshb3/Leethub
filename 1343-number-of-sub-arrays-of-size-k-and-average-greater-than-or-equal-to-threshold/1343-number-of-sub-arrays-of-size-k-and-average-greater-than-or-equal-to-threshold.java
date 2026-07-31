class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int sum=0;
        int c=0;
        int[] prefix=new int[arr.length+1];
        prefix[0]=0;
        for(int i=0;i<arr.length;i++)
        {
            prefix[i+1]=prefix[i]+arr[i];
        }
        int j=0;
        while(j<=arr.length-k)
        {
            sum=prefix[j+k]-prefix[j];
            if(sum/k>=threshold)
            {
                c++;
            }
            j++;
        }
        return c;
    }
}