class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
            list.sort((a,b) -> map.get(b) - map.get(a));
            StringBuilder sb = new StringBuilder();
            for(char ch : list){
                int k = map.get(ch);
                for(int i=0 ; i<k ; i++){
                    sb.append(ch);
                }
            }
            return sb.toString();
    }
}