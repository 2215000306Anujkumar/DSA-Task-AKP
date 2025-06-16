class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        int max = -1 ;
        for(int i=0;i<nums.length-1;i++){
            max = Math.max(max,i+nums[i]);
            if(nums[i]==0 && max ==i ) return false;
            if(max>=nums.length-1) return true;
        }
        return max>=nums.length-1;
    }
}