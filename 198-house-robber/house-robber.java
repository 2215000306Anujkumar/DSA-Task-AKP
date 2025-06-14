class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

       return find(nums ,n-1 ,dp);


        
    }
    int find(int[] nums , int i , int[] dp ){
        if(i<0){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }



        int taken = nums[i] + find(nums , i -2 , dp);
        int nottaken = find(nums , i-1 ,dp);

        return dp[i] =  Math.max(taken , nottaken);




    }


}