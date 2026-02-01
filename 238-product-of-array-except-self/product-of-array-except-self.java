class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        arr[0] = 1;
        for(int i=1 ; i<nums.length ; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }
        int rightP = 1;
        for(int j=nums.length-1 ; j>=0 ; j--){
            arr[j] = arr[j] * rightP;
            rightP *= nums[j];
        }
        return arr;
    }
    
}