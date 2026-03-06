public class EvaluatePostfix {

    private IntStack intStack = new IntStack();

    public int operate(char operator, int a, int b) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if(b==0) throw new ArithmeticException("Division by zero");
                return a / b;
            case '%':
                if(b==0) throw new ArithmeticException("Modulo by zero");
                return a % b;
            case '^': return (int) Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public int evaluate(String postfix) {

        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            // If operand, push to stack
            if (Character.isDigit(ch)) {
                int num=Character.getNumericValue(ch);
                intStack.push(num);
            }
            // If operator
            else {
                int b = intStack.pop();
                int a = intStack.pop();

                int result = operate(ch, a, b);
                intStack.push(result);
            }
        }
        return intStack.pop();
    }
}