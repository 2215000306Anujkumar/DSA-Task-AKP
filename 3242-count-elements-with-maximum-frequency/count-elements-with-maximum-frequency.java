class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for(int num : nums){
            if(freq.containsKey(num)){
                freq.put(num , freq.get(num)+1);
            }else{
                freq.put(num , 1);
            }
            if(freq.get(num) > maxFreq){
                maxFreq = freq.get(num);
            }
        }
        int result = 0;
        for(int val : freq.values()){
           if(val == maxFreq){
             result += val;
           }
        }
        return result;
    }
}