class Solution {
    public String smallestPalindrome(String s) 
    {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        StringBuilder l=new StringBuilder();
        StringBuilder m=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<f[i]/2;j++)
            {
                l.append((char)(i+'a'));
            }
            if(f[i]%2==1)
            {
                m.append((char)(i+'a'));
            }
        }
        StringBuilder r=new StringBuilder(l);
        r.reverse();
        return l.toString() + m.toString() + r.toString();

    }
}