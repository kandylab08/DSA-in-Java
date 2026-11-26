class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;

        for (int i = cardPoints.length - k; i < cardPoints.length; i++)
            score += cardPoints[i];

        int curMaxScore = score;

        for (int i = 0; i < k; i++) {
            score = score + cardPoints[i] - cardPoints[cardPoints.length - k + i];

            curMaxScore = Math.max(curMaxScore, score);
        }

        return curMaxScore;
    }
}