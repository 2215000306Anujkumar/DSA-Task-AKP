class Solution {
    public int maxAscendingSum(int[] nums) {
        int result = nums[0];
        int curSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] > nums[i-1]){
                curSum += nums[i];
            }else{
                curSum =nums[i];
            }
            result = Math.max(result , curSum);
        }
        return result;
    }
}