class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }

        int maxScore = currentSum;
        for (int i = 0; i < k; i++) {
            currentSum -= cardPoints[k - 1 - i]; 
            currentSum += cardPoints[n - 1 - i]; 
            maxScore = Math.max(maxScore, currentSum);
        }

        return maxScore;
    }
}
