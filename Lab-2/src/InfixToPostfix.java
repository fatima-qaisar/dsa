public class InfixToPostfix {
    private CharStack st = new CharStack();
    private StringBuilder output = new StringBuilder();

    InfixToPostfix() {
    }

    public int precedenceOf(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '%' || ch == '/' || ch == '*') {
            return 2;
        } else if(ch=='^'){
            return 3;
        }
        return -1;
    }

    public boolean isLeftAssociative(char ch) {
        if (ch == '^') {
            return false;
        }
        return true;
    }

    public StringBuilder convertToPostfix(String infixExp) {
        for (int i = 0; i < infixExp.length(); i++) {
            char c = infixExp.charAt(i);
            if (Character.isDigit(c) || Character.isLetter(c)) {
                output.append(c);
            } else {
                if (c == '(') {
                    st.push(c);
                } else if (c=='+'||c=='-'||c=='*'||c=='/'||c=='%'||c=='^') {
                    while (!st.isEmpty() && (precedenceOf(c)<precedenceOf(st.peek()) || (precedenceOf(c)==precedenceOf(st.peek()) && isLeftAssociative(c)))){
                        output.append(st.peek());
                        st.pop();
                    }st.push(c);
                } else if (c==')') {
                    while (!st.isEmpty() && st.peek()!='('){
                        output.append(st.peek());
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            output.append(st.peek());
            st.pop();
        }
        return output;
    }
}
