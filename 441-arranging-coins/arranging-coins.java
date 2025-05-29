class Solution {
    public int arrangeCoins(int n) {
        long l = 0 , r = n;
        while(l <= r){
            long mid = l + (r-l)/2;
            long coinused = mid *(mid + 1)/2;
            if(coinused == n){
                return (int) mid;
            }else if(coinused < n){
                l = mid + 1;
            }else{
                r = mid-1;
            }
        }
        return (int) r;
    }
}