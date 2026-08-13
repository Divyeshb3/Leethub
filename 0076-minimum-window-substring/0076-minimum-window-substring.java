class Solution {
    public String minWindow(String s, String t) 
    {
        HashMap<Character,Integer> tmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        int l=0;
        int c=t.length();
        int minlen=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<t.length();i++)
        {
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(tmap.containsKey(ch)&&smap.get(ch)<=tmap.get(ch))
            {
                c--;
            }
            while(c==0)
            {
                if(r-l+1<minlen)
                {
                    minlen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                char leftchar=s.charAt(l);
                smap.put(leftchar,smap.getOrDefault(leftchar,0)-1);
                if(tmap.containsKey(leftchar) && smap.get(leftchar)<tmap.get(leftchar))
                {
                    c++;
                }
                l++;
            }
        }
        return ans;
    }
}