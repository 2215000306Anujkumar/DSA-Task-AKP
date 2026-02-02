class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int EXsum = n*(n+1)/2;
        int ACsum = 0;
        for(int num : nums){
            ACsum += num;
        }
        return EXsum - ACsum;
    }
}