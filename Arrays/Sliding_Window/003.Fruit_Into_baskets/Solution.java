class Solution {
    public int totalFruit(int[] fruits) {
        int f1 = -1, f2 = -1;
        int last1 = -1, last2 = -1;
        int left = 0, maxFruit = 0;
        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            if (fruit == f1) {
                last1 = right;
            } else if (fruit == f2) {
                last2 = right;
            } else if (f1 == -1) {
                f1 = fruit;
                last1 = right;
            } else if (f2 == -1) {
                f2 = fruit;
                last2 = right;
            } else {
                if (last1 < last2) {
                    left = last1 + 1;
                    f1 = fruit;
                    last1 = right;
                } else {
                    left = last2 + 1;
                    f2 = fruit;
                    last2 = right;
                }
            }
            maxFruit = Math.max(maxFruit, right - left + 1);
        }
        return maxFruit;
    }
}