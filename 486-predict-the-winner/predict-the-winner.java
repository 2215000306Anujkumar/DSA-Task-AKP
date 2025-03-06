class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n =  nums.length;
        int[][] dp = new int[n][n];
        for(int i=0 ; i<n ; i++){
            dp[i][i] = nums[i];
        }
        for(int x = 2 ; x<=n ; x++){
            for(int y = 0 ; y<= n-x ; y++){
                int j = y + x-1;
                dp[y][j] = Math.max(nums[y]-dp[y+1][j],nums[j] -dp[y][j-1]);
            }
        }
        return dp[0][n-1]>=0;
    }
}