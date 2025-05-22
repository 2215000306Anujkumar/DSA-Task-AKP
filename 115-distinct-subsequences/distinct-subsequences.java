class Solution {
    public int numDistinct(String s, String t) {
   int m = s.length();
        int n = t.length();
        
        // dp[i][j] = number of subsequences of s[0..i-1] that equals t[0..j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Empty string t can always be formed by deleting all characters
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Fill the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}