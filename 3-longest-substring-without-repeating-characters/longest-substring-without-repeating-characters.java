class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int l = 0;
        HashSet<Character> sc = new HashSet<>();
        for(int r = 0 ; r<n ; r++){
        while(sc.contains(s.charAt(r))){
            sc.remove(s.charAt(l));
            l++;
        }
        sc.add(s.charAt(r));
        maxlen = Math.max(maxlen , r-l+1);
        }
        return maxlen;
    }
}