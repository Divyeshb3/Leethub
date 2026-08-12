class Solution {
    public String longestPalindrome(String s) 
    {
        String max_substr=s.substring(0,1);
       for(int i=0;i<s.length();i++)
       {
            String odd=validStr(i,i,s);
            String even=validStr(i,i+1,s);
            if(even.length()>max_substr.length())
            {
                max_substr=even;
            }
            if(odd.length()>max_substr.length())
            {
                max_substr=odd;
            }
       }
       return max_substr;
    }
    public String validStr(int l,int r,String s)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}