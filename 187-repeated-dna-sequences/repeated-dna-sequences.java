class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> repeat = new HashSet<>();
        Set<String> dekha = new HashSet<>();
        for(int i=0 ; i<=s.length()-10;i++){
            String substring = s.substring(i , i+10);
            if(!dekha.add(substring)){
                repeat.add(substring);
            }
        }
        return new ArrayList<>(repeat);
    }
}