class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        
        int l=0,r=0;
        int s=0,e=0;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                s+=customers[i];
            }
        }
        for(r=0;r<minutes;r++)
        {
            if(grumpy[r]==1)
            {
                e+=customers[r];
            }
        }
        int maxe=e;
        while(r<customers.length)
        {
            if(grumpy[l]==1)
            {
                e-=customers[l];
            }
            if(grumpy[r]==1)
            {
                e+=customers[r];
            }
            maxe=Math.max(maxe,e);
            l++;
            r++;
        }
        return s+maxe;
    }
}