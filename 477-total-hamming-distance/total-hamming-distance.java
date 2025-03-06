class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDis = 0;
        int n = nums.length;
        for(int x = 0 ; x<32 ; x++){
            int countOne = 0;
            for(int num : nums){
                countOne += (num >> x) & 1;

            }
            int countZero = n - countOne;
            totalDis += countOne * countZero;
        }
        return totalDis;
    }
}