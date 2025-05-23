class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int minprice = prices[0];
        left[0] = 0;
        for(int i = 1; i < n; i++){
            minprice = Math.min(minprice, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - minprice);
        }

        int maxprice = prices[n - 1];
        right[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--){
            maxprice = Math.max(maxprice, prices[i]);
            right[i] = Math.max(right[i + 1], maxprice - prices[i]);
        }

        int maxprofit = 0;
        for(int i = 0; i < n; i++){
            maxprofit = Math.max(maxprofit, left[i] + right[i]);
        }
        return maxprofit;
    }
}
