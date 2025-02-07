class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int c = 0;
        int i = 0;
        while (arr[k] > 0) { 
            if (arr[i] > 0) { 
                arr[i] -= 1;
                c++;
            }
            if (i == k && arr[k] == 0) break;  
            i++;
            if (i == arr.length) i = 0;     
        }  
        return c;
    }
}
