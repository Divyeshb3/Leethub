class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> pmap=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            pmap.put(p.charAt(i),pmap.getOrDefault(p.charAt(i),0)+1);
        }
        int l=0;
        int count=p.length();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(pmap.containsKey(ch) && smap.get(ch)<=pmap.get(ch))
            {
                count--;
            }
            if(r-l+1>p.length())
            {
                char left=s.charAt(l);
                if(pmap.containsKey(left) && smap.get(left)<=pmap.get(left))
                {
                    count++;
                }
                smap.put(left,smap.getOrDefault(left,0)-1);
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