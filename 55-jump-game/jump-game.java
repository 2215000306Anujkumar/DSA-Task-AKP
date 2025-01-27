class Solution {
    public boolean canJump(int[] nums) {
        int lastP = nums.length-1;
        for(int i = nums.length-2 ; i>=0 ; i--){
            if(nums[i] + i >= lastP){
                lastP = i;
            }
        }
        return lastP==0;
    }
}