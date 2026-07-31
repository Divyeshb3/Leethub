class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int sum=0;
        int c=0;
        int l=0,r=k-1;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if(sum/k>=threshold)
        {
            c++;
        }
        while(r<arr.length-1) 
        {
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            if(sum/k>=threshold)
            {
                c++;
            }   
        }
        return c;
    }
}