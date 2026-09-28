import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            switch (s) {
                case "+":
                    int op2 = st.pop();
                    int op1 = st.pop();
                    st.push(op1 + op2);
                    break;

                case "-":
                    op2 = st.pop();
                    op1 = st.pop();
                    st.push(op1 - op2);
                    break;

                case "*":
                    op2 = st.pop();
                    op1 = st.pop();
                    st.push(op1 * op2);
                    break;

                case "/":
                    op2 = st.pop();
                    op1 = st.pop();
                    st.push(op1 / op2);
                    break;

                default:
                    st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}