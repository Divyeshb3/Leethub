class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> ans=new ArrayList<>();

        int[] freq=new int[26];
        for(int i=0;i<p.length();i++)
        {
            freq[p.charAt(i)-'a']++;
        }
        int l=0;
        int count=p.length();
        
        for(int r=0;r<s.length();r++)
        {
            int ch=s.charAt(r)-'a';
            if(freq[ch]>0)
            {
                count--;
            }
            freq[ch]--;
            if(r-l+1>p.length())
            {
                int left=s.charAt(l)-'a';
                freq[left]++;
                if(freq[left]>0)
                {
                    count++;
                }
                l++;
            }
            if(count==0)
            {
                ans.add(l);
            }
        }
        return ans;
    }
}