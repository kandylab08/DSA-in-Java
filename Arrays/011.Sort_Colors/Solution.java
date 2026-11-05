class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = nums.length - 1;

        while (ones <= twos) {
            if (nums[ones] == 0) {
                int temp = nums[zeroes];
                nums[zeroes] = nums[ones];
                nums[ones] = temp;

                ones++;
                zeroes++;
            } 
            else if (nums[ones] == 1) {
                ones++;
            } 
            else {
                int temp = nums[twos];
                nums[twos] = nums[ones];
                nums[ones] = temp;

                twos--;
            }
        }
    }
}