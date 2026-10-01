class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lowWeight = 0;
        int highWeight = 0;

        for (int w : weights) {
            lowWeight = Math.max(lowWeight, w);
            highWeight += w;
        }

        while (lowWeight <= highWeight) {
            int midWeight = lowWeight + (highWeight - lowWeight) / 2;

            if (canShipInDays(midWeight, weights, days))
                highWeight = midWeight - 1;
            else
                lowWeight = midWeight + 1;
        }

        return lowWeight;
    }

    private boolean canShipInDays(int midWeight, int[] weights, int days) {
        int daysRequired = 1;
        int curWeight = 0;

        for (int w : weights) {
            if (curWeight + w > midWeight) {
                daysRequired++;
                curWeight = w;
            } else {
                curWeight += w;
            }

            if (daysRequired > days)
                return false;
        }

        return true;
    }
}