import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;

                char topElem = st.peek();

                if (c == ')' && topElem == '(')
                    st.pop();
                else if (c == '}' && topElem == '{')
                    st.pop();
                else if (c == ']' && topElem == '[')
                    st.pop();
                else
                    return false;
            }
        }

        return st.isEmpty();
    }
}