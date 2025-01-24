class Solution {
    public void sortColors(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==0){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==1){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==2){
                list.add(nums[i]);
            }
        }
        for(int i=0 ; i<nums.length ;i++){
            nums[i] = list.get(i);
        }
    }
}