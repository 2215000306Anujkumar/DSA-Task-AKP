class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length , ops =0;
        for(int i=0 ;i+2 < n ; i++){
            if(nums[i] == 0){
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^=1;
                ops++;
            }
        }
        return (nums[n-2]==0 || nums[n-1]==0) ? -1 : ops;
    }
}