class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num , 1);
            }
        }
        for(int key : map.keySet()){
            if(k==0){
                if(map.get(key) > 1){
                    count++;
                }
            }else{
                if(map.containsKey(key+k)){
                    count++;
                }
            }
        }
        return count;
    }
}