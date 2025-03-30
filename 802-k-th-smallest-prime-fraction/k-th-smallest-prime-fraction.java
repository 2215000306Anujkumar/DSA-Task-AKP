class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
         int n = arr.length;
        double left = 0.0, right = 1.0;
        
        while (true) {
            double mid = (left + right) / 2;
            int numerator = 0, denominator = 1;
            int total = 0, j = 1;
            
            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }
                total += (n - j);
                
                if (j < n && numerator * arr[j] < denominator * arr[i]) {
                    numerator = arr[i];
                    denominator = arr[j];
                }
            }
            
            if (total == k) {
                return new int[]{numerator, denominator};
            } else if (total < k) {
                left = mid;
            } else {
                right = mid;
            }
        }
    }
}