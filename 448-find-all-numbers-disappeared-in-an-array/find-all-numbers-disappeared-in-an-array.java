class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        for(int i=1 ; i<=nums.length ;i++){
            if(!map.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }
}