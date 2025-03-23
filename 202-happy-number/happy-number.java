class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> sb = new HashSet<>();
        while(n != 1 && !sb.contains(n)){
            sb.add(n);
            n = getSumOfSquares(n);
        }
        return n==1;
    }
     private static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; 
            sum += digit * digit; 
            num /= 10; 
        }
        return sum;
    }
}