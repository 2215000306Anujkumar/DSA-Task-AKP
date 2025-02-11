class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] X = new int[nums.length];
        for(int i=1 ; i<nums.length ; i++){
            for(int j=0 ; j<i ; j++){
                if(nums[i] > nums[j]){
                    if(X[j]+1 > X[i]){
                        X[i] = X[j] +1;
                    }
                }
            }
        }
        int maxidx = 0 ; 
        for(int i=0 ; i<X.length;i++){
            if(X[i] > X[maxidx]){
                maxidx = i;
            }
        }
        return X[maxidx] + 1;
        
    }
}