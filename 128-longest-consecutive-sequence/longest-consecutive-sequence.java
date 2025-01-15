class Solution {
    public int longestConsecutive(int[] nums) {
        int longLength = 0;
        Map<Integer , Boolean> exploreMap = new HashMap<>();
        for(int num : nums){
            exploreMap.put(num , Boolean.FALSE);
        }
        for(int num : nums){
            int currentLength = 1;
            int nexnum = num +1;
            while(exploreMap.containsKey(nexnum) && exploreMap.get(nexnum) == false){
                currentLength++;
                exploreMap.put(nexnum , Boolean.TRUE);

                nexnum++;
            }
            int prevnum = num-1;
            while(exploreMap.containsKey(prevnum) && !exploreMap.get(prevnum)){
                currentLength++;
                exploreMap.put(prevnum , Boolean.TRUE);
                prevnum--;
            }
            longLength = Math.max(longLength , currentLength);
        }
        return longLength;
    }
}