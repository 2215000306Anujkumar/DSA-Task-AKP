class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        if(t.length() > s.length()){
            return result;
        }
        int[] tcount = new int[126];
        for(char ch : t.toCharArray()){
            tcount[ch]++;
        }
        char[] sChar = s.toCharArray();
        int left=0 , right=0;
        int found=0 , tofind = t.length();
        int minWindowLength = Integer.MAX_VALUE;
        while(right < s.length()){
            char ch = sChar[right];
            tcount[ch]--;
            if(tcount[ch] >=0){
                found++;
            }
            while(found == tofind){
                if(minWindowLength > (right - left +1)){
                    minWindowLength = right - left +1;
                    result = s.substring(left,right+1);
                }
                tcount[sChar[left]]++;
                if( tcount[sChar[left]] > 0){
                    found--;
                }
                left++;
            }
            right++;
        }
        return result;
    }
}