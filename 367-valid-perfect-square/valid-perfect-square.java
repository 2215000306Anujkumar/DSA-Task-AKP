class Solution {
    public boolean isPerfectSquare(int n) {
        if(n < 1) return false;
        long l = 1 , r = n;
        while(l <= r){
            long mid = l + (r-l)/2;
            long square = mid * mid;
            if(square == n){
                return true;
            }else if(square < n){
                l = mid +1;
            }else{
                r = mid -1;
            }
        }
        return false;
    }
}