class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stop = new int[1001];

        for(int[] trip : trips){
            int newpess = trip[0];
            int from = trip[1];
            int to = trip[2];

            stop[from] += newpess;
            stop[to] -= newpess;
        }
        int currpess = 0;
        for(int i=0 ; i<stop.length ; i++){
            currpess += stop[i];
            if(currpess > capacity){
                return false;
            }
        }
        return true;
    }
}