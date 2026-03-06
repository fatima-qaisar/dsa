import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        InfixToPostfix infixToPostfix=new InfixToPostfix();
       String postFixExpression= infixToPostfix.convertToPostfix(inputString);
       System.out.println(postFixExpression);
       System.out.println("Evaluating postfix.....");
       EvaluatePostfix evaluatePostfix=new EvaluatePostfix();
       int finalAnswer=evaluatePostfix.evaluate(postFixExpression);
       System.out.println(finalAnswer);
       System.out.println(evaluatePostfix.evaluate("623+-382/+*2^3+"));
       sc.close();
    }
}