class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] word=s.split(" ");
        if(pattern.length()!=word.length)
        {
            return false;
        }
        HashMap<Character,String> pmap=new HashMap<>();
        HashMap<String,Character> smap=new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String w=word[i];
            if(pmap.containsKey(ch) && !pmap.get(ch).equals(w))
            {
                return false;
            }
            if(smap.containsKey(w) && smap.get(w)!=ch)
            {
                return false;
            }
            pmap.put(ch,w);
            smap.put(w,ch);
        }
        return true;
    }
}