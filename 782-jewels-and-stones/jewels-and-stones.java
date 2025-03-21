class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelset = new HashSet<>();

        for(char jewel : jewels.toCharArray()){
            jewelset.add(jewel);
        }
        int count = 0;
        for(char stone : stones.toCharArray()){
            if(jewelset.contains(stone)){
                count++;
            }
        }
        return count;
    }

}