class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            char chars[] = str.toCharArray();
            Arrays.sort(chars);
            String sortString = new String(chars);
            if(map.containsKey(sortString)==false){
                map.put(sortString , new ArrayList<>());
            }
            map.get(sortString).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}