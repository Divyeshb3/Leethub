class Solution {
    public static int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int res=0;
        while(l<r)
        {
            int water=Math.min(height[l],height[r])*(r-l);
            res=Math.max(res,water);
            if(height[l]<height[r])
            {
                l+=1;
            }
            else
            {
                r-=1;
            }
        }
    return res;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        int[] height=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            height[i]=s.nextInt();
        }
        System.out.println(maxArea(height));
        s.close();

    }
}