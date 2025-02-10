class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        char[] cha = s.toCharArray();
        for(char ch : cha){
            if(Character.isDigit(ch)){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}