class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
         int[] res = new int[n];
        int l = (n-1)/2;
        int r = n-1;
        for(int i=0 ; i<nums.length ; i++){
            if(i % 2 == 0){
                res[i] = nums[l--];
            }else{
                res[i] = nums[r--];
            }
        }
        for(int i=0 ; i<n ;i++){
            nums[i] = res[i];
        }
    }
}