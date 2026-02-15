import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    ArrayStack arrayStack=new ArrayStack();
    arrayStack.push(5);
    arrayStack.push(6);
    arrayStack.push(6);
    arrayStack.push(8);
    arrayStack.push(9);
    arrayStack.printStack();
    int topOfStack= arrayStack.peek();
    System.out.println("\nValue at the top of Stack: " + topOfStack);
    arrayStack.pop();
    arrayStack.printStack();

    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(arrayStack.searchStack(num));
    Scanner sc2 =new Scanner(System.in);
    int num2=sc.nextInt();
    System.out.println(arrayStack.elementFreq(num2));
    System.out.println("\nDynamic Stack");
    ArrayListStack arrayListStack=new ArrayListStack();
    arrayListStack.push(3);
    arrayListStack.push(4);
    arrayListStack.printStack();
    }
}