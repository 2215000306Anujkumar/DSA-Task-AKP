class Solution {
    public int minMoves(int[] nums) {
        int minele = nums[0];
        for(int num : nums){
            if(num < minele){
                minele = num;
            }
        }
        int move = 0;
        for(int num : nums){
            move += num - minele;
        }
        return move;
    }
}