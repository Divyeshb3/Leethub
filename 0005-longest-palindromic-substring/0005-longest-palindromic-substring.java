class Solution {
    public String longestPalindrome(String s) 
    {
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++)
        {
            // Odd length
            int l = i;
            int r = i;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
            {
                if(r - l > end - start)
                {
                    start = l;
                    end = r;
                }

                l--;
                r++;
            }

            // Even length
            l = i;
            r = i + 1;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
            {
                if(r - l > end - start)
                {
                    start = l;
                    end = r;
                }

                l--;
                r++;
            }
        }

        return s.substring(start, end + 1);
    }
}