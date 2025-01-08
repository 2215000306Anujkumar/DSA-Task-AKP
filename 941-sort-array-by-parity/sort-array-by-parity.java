class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int x = 0;
        int y = 0;
        while( y < nums.length){
            if( nums[y] % 2 == 0){
                swap(nums , x ,y);
                x++;
                y++;
            }else{
                y++;
            }
        }
        return nums;
    }
}