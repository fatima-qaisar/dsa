import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        InfixToPostfix infixToPostfix=new InfixToPostfix();
       StringBuilder postFixExpression= infixToPostfix.convertToPostfix(inputString);
       System.out.println(postFixExpression);
       sc.close();
    }
}