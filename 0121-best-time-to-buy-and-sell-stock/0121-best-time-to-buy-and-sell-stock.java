class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxprice=0;
        int curprice=0;
        for(int i=1;i<prices.length;i++)
        {
            int diff=prices[i]-prices[i-1];
            curprice+=diff;
            if(curprice<0)
            {
                curprice=0;
            }
            maxprice=Math.max(maxprice,curprice);
        }
        return maxprice;
    }
}