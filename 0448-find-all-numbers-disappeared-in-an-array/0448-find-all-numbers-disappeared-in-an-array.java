class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
       int i=0;
        int n=nums.length;
        while(i<n)
        {
            int cor=nums[i]-1;
            if(nums[i]!=nums[cor])
            {
                int temp=nums[i];
                nums[i]=nums[cor];
                nums[cor]=temp;
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                ans.add(i+1);
            }
        } 
        return ans;
    }
}