class Solution {
    public int thirdMax(int[] nums) {
    
        Arrays.sort(nums);
        // if(nums.length < 3){
        //     return nums[nums.length - 1];
        // }else{
        //         return nums[nums.length - 3];
        // }
        int count = 1;
        int num = nums[nums.length -1];
        for(int i = nums.length -2 ; i >= 0;i--){
            if(count== 3){
                return num;
            }

            if(nums[i] != num){
                count++;
                num = nums[i];
            }
            

        }
      if(count!=3)return nums[nums.length-1];
      return num;
    }
}