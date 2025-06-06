class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[row][cols];
        for(int i = row-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(i ==row-1 && j !=cols-1){
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }else if(j ==cols-1 && i !=row-1){
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }else if(i !=row-1 && j != cols-1){
                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j] , dp[i][j+1]);
                }else{
                    dp[i][j] = grid[i][j];
                }
            }
        }
        return dp[0][0];
    }
}