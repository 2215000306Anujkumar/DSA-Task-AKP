class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int reverse = 0;
        while(x>0){
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x /= 10;
        }
        if(reverse == ori){
            return true;
        }
        return false;
    }
}