class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = 0;

        for (int n : bloomDay) {
            low = Math.min(low, n);
            high = Math.max(high, n);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(mid, bloomDay, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    private boolean canMakeBouquets(
        int mid,
        int[] bloomDay,
        int m,
        int k
    ) {
        int bouquetCount = 0;
        int flowerCount = 0;

        for (int n : bloomDay) {
            if (n <= mid)
                flowerCount++;
            else
                flowerCount = 0;

            if (flowerCount == k) {
                bouquetCount++;
                flowerCount = 0;
            }
        }

        return m <= bouquetCount;
    }
}