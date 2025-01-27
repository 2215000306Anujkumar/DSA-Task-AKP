class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key : map.keySet()){
           if(map.get(key) > n/2)
           return key;
        }
        return -1;
    }
}