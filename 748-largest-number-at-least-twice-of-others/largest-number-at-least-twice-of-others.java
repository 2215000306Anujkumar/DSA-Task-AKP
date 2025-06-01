class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null && nums.length==0)return -1;

        int max = -1;
        int secmax = -1;
        int index = -1;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > max){
                secmax = max;
                max = nums[i];
                index = i;
            }else if(nums[i] > secmax){
                secmax = nums[i];
            }
        }
        return max >= 2*secmax ?index : -1;
    }
}