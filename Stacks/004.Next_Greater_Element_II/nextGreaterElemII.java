import java.util.Stack;
import java.util.Arrays;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();

        Arrays.fill(res, -1);

        for (int i = 0; i < 2 * n; i++) {
            int k = i % n;

            if (stk.isEmpty()) {
                stk.push(k);
                continue;
            }

            if (nums[stk.peek()] >= nums[k]) {
                stk.push(k);
            } else {
                while (!stk.isEmpty() && nums[stk.peek()] < nums[k]) {
                    res[stk.peek()] = nums[k];
                    stk.pop();
                }
                stk.push(k);
            }
        }

        return res;
    }
}