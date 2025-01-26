class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>1){
                duplicates.add(key);
            }
        }
        
         return duplicates;
    }
   
}