class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i++]==nums[j]){
                return nums[i];
            }
        }
      return -1;  
    }
}