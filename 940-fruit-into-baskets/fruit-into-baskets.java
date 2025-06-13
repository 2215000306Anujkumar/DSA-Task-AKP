class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen = 0;
        int l  = 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int r=0 ; r<fruits.length ; r++){
            int fruit = fruits[r];

            if(map.containsKey(fruit)){
                map.put(fruit , map.get(fruit) +1);
            }else{
                map.put(fruit , 1);
            }
            while(map.size() > 2){
                int lfruit = fruits[l];
                map.put(lfruit , map.get(lfruit) - 1);
                if(map.get(lfruit) == 0){
                    map.remove(lfruit);
                }
                l++;
            }
            maxlen = Math.max(maxlen , r-l+1);
        }
        return maxlen;
    }
}