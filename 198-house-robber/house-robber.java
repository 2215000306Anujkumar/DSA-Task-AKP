class Solution {
    public int rob(int[] nums) {
        // int n = nums.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, -1);

        // return find(nums, n - 1, dp);
        return find2(nums);

    }

    int find(int[] nums, int i, int[] dp) {
        if (i < 0) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int taken = nums[i] + find(nums, i - 2, dp);
        int nottaken = find(nums, i - 1, dp);

        return dp[i] = Math.max(taken, nottaken);

    }

  int  find2(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if(n == 1) return dp[0];
        dp[1] = Math.max(nums[0] , nums[1]);

        for(int i = 2 ; i < n ; i++){
            int taken = nums[i] +  dp[i-2];
            int nottaken = dp[i-1];

            dp[i] =  Math.max(taken , nottaken);
                            

        }

        return dp[n-1];





    }

}