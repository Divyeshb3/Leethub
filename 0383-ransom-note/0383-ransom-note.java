class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if(ransomNote.length()>magazine.length())
        {
            return false;
        }
        int[] freq1=new int[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            freq1[ransomNote.charAt(i)-'a']++;
        }
        int[] freq2=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            freq2[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq1[i]>freq2[i])
            {
                return false;
            }
        }

        return true;
    }
}