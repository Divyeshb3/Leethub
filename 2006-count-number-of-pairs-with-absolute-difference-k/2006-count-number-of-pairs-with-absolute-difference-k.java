class Solution {
    public int countKDifference(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];

            ans+=map.getOrDefault(num-k,0);
            ans+=map.getOrDefault(num+k,0);

            map.put(num,map.getOrDefault(num,0)+1);
        }
        return ans;
    }
}