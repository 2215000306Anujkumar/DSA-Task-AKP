class Solution {
    public char getval(char ch){
        switch(ch){
            case ')':return '(';
            case '}':return '{';
            case ']':return '[';
            default: return ' ';
        }
    }
    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(open.indexOf(ch)!=-1){
                st.push(ch);
            }else{
                if(st.size()==0) return false;
                char temp = st.pop();
                if(getval(ch) != temp) return false;
            }
        }
        return st.size()==0;

    }
}