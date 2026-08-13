class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int l=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq1[s1.charAt(i)-'a']++;
        }
        for(int r=0;r<s2.length();r++)
        {
            freq2[s2.charAt(r)-'a']++;
            while(r-l+1>s1.length())
            {
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
            if(s1.length()==r-l+1)
            {
                boolean match=true;
                for(int i=0;i<26;i++)
                {
                    if(freq1[i]!=freq2[i])
                    {
                        match=false;
                        break;
                    }
                }
                if(match==true)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}