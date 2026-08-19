class Solution 
{
    public int compress(char[] chars) 
    {
        int i=0,j=1;
        int write=0;
        while(j<=chars.length)
        {
            if(j==chars.length || chars[j-1]!=chars[j])
            {
                chars[write++]=chars[i];
                int count=j-i;
                if(count>1)
                {
                    String nums=String.valueOf(count);
                    for(int k=0;k<nums.length();k++)
                    {
                        chars[write++]=nums.charAt(k);
                    }
                }
                i=j;
            }
            j++;
        }
        return write;
    }
}