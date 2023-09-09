class Solution {
    int[] nums ;
    Integer[] cache;
    public int combinationSum4(int[] nums, int target) {
        this.nums = nums;
        this.cache = new Integer[target + 1];
        return helper(target);
    }
    private int helper(int curr){
        if (curr == 0) return 1;
        if (curr < 0) return 0;
        if (cache[curr] != null ) return cache[curr];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += helper(curr - nums[i]);
        }
        cache[curr] = result;
        return result;
    }
    // public int combinationSum4(int[] nums, int target) {
    //     int[] dp = new int[target + 1];

    //     for (int i = 0; i < dp.length; i++)
    //         dp[i] = -1;

    //     return helper(nums, target, dp);
    // }

    // private int helper(int[] nums, int target, int[] dp) {
    //     if (target == 0) return 1;
    //     if (dp[target] != -1) return dp[target];

    //     int result = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (target >= nums[i])
    //             result += helper(nums, target - nums[i], dp);
    //     }
    //     dp[target] = result;
    //     return result;
    // }
}