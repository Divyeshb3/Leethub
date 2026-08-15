class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        
        int[] smap=new int[128];
        int[] tmap=new int[128];
     
       for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i);
            int b=t.charAt(i);
            if(smap[a]!=tmap[b])
            {
                return false;
            }
            smap[a]=i+1;
            tmap[b]=i+1;
        }
        return true;
    }
}