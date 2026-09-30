class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int p : piles) {
            if (p > high) {
                high = p;
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(mid, piles, h))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    private boolean canEatAll(int bananasCount, int[] piles, int h) {
        long count = 0;
        for (int p : piles) {
            count += (p + bananasCount - 1) / bananasCount;
            if (count > h)
                return false;
        }
        return true;
    }
}