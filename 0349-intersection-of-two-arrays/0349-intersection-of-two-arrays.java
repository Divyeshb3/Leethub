class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(map1.containsKey(nums2[i]) && !map2.containsKey(nums2[i]))
            {
                ans.add(nums2[i]);
                map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
            }
        }

        int[] result=new int[ans.size()];

        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }

        return result;
    }
}