class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        long goodP = 0 ;
        int n=nums.length;
        long totalP = (long)n*(n-1)/2;
        for(int j = 0; j<n ; j++){
            int key = nums[j] - j ;
    
            if(map.containsKey(key)){
                goodP += map.get(key);
                map.put(key , map.get(key)+1);
            } else{
                map.put(key , 1);
            }
        }
        return totalP-goodP;
    }
}