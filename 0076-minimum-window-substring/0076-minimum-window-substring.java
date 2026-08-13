class Solution {
    public String minWindow(String s, String t) 
    {
        int[] freq = new int[128];

        for(int i = 0; i < t.length(); i++)
        {
            freq[t.charAt(i)]++;
        }

        int l = 0;
        int count = t.length();

        int minlen = Integer.MAX_VALUE;
        int start = 0;

        for(int r = 0; r < s.length(); r++)
        {
            char ch = s.charAt(r);

            if(freq[ch] > 0)
            {
                count--;
            }

            freq[ch]--;

            while(count == 0)
            {
                if(r - l + 1 < minlen)
                {
                    minlen = r - l + 1;
                    start = l;
                }

                char left = s.charAt(l);

                freq[left]++;

                if(freq[left] > 0)
                {
                    count++;
                }

                l++;
            }
        }

        return minlen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minlen);
    }
}