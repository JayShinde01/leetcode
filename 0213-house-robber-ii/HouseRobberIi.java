class Solution {
    public int rob(int[] nums) {
        return helper(nums,nums.length-1);
    }
    public int helper(int nums[],int n){
        if(n == 0)return nums[0];
        if(n == 1)return nums[1];
        return Math.max(helper(nums,n-1),nums[n]+helper(nums,n-2));
    }
}