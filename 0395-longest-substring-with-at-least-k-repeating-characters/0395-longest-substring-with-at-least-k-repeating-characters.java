class Solution {
    public int longestSubstring(String s, int k) 
    {
        int ans = 0;
        
        for(int distinct = 1; distinct <= 26; distinct++)
        {
            int[] freq = new int[26];

            int l = 0;
            int unique = 0;
            int countK = 0;

            for(int r = 0; r < s.length(); r++)
            {
                int index = s.charAt(r) - 'a';

                freq[index]++;

                if(freq[index] == 1)
                {
                    unique++;
                }

                if(freq[index] == k)
                {
                    countK++;
                }

                while(unique > distinct)
                {
                    int left = s.charAt(l) - 'a';

                    if(freq[left] == k)
                    {
                        countK--;
                    }

                    freq[left]--;

                    if(freq[left] == 0)
                    {
                        unique--;
                    }

                    l++;
                }

                if(unique == distinct && countK == distinct)
                {
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }

        return ans;
    }
}