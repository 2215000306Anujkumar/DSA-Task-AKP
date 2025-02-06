class Solution {
    public List<Integer> findPeaks(int[] arr) {
        List<Integer> peak = new ArrayList<>();
        int n = arr.length;
        if(n==0) return peak;
       for(int i=1;i<n-1;i++)
       {
        if(arr[i-1]<arr[i] && arr[i+1]<arr[i])peak.add(i);
       }
        return peak;
    }
}