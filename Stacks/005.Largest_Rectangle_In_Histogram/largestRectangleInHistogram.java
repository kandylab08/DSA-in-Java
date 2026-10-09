import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() &&
                    (i == n || heights[st.peek()] > heights[i])) {

                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            if (i < n)
                st.push(i);
        }

        return maxArea;
    }
}
