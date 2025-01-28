class Solution {
    public int findLHS(int[] nums) {
        int longest = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i , map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int k : map.keySet()){
            if(map.containsKey(k+1)){
                longest = Math.max(longest , map.get(k)+map.get(k+1));
            }
        }
        return longest;
    }
}