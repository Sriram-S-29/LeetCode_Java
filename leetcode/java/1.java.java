class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] show = new int[2];
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]+nums[i]==target)
                {
                        show[0]=i;
                        show[1]=j;
                }
            }
        }
        return show;
    }
}