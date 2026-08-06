class Solution {
    public int smallestNumber(int n, int t) 
    {
        while(true)
        {
            int num=n;
            int prod=1;
            while(num>0)
            {
                int cur=num%10;
                num/=10;
                prod*=cur;
            }
            if(prod%t==0)
            {
                return n;
            }
            n++;
        }
        
    }
}