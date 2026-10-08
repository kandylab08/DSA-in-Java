import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {

                int tp = s.pop();
                res[tp] = i - tp;
            }

            s.push(i);
        }

        return res;
    }
}