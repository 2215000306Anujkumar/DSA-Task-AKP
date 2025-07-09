class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;

        int result = 10 ;
        int unique = 9;
        int avaNo = 9;

        for(int i=2 ; i<=n ;i++){
            if(avaNo==0) break;
            unique *= avaNo;
            result += unique;
            avaNo--;
        } 
        return result;
    }
}