class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxlength=0;
        
        HashSet<Character> result = new HashSet<>();

        while(r < s.length()){
            char ch = s.charAt(r);
            if(!result.contains(ch)){
                result.add(ch);
                maxlength = Math.max(maxlength ,r-l+1);
                r++;
            }else{
                result.remove(s.charAt(l));
                l++;
            }
        }
        return maxlength;
    }
}