class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(s1.length() == 0) continue;
                else{
                    s1.deleteCharAt(s1.length()-1);
                }
            }else{
                s1.append(ch);
            }
        }
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(s2.length() == 0) continue;
                else{
                    s2.deleteCharAt(s2.length()-1);
                }
            }else{
                s2.append(ch);
            }
        }
         if(s1.toString().equals(s2.toString())) return true;
        return false;
    }
}