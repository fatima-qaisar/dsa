import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    /*
    //Array Stack
    ArrayStack arrayStack=new ArrayStack(4);
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
    System.out.println("Search stack for: ");
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(arrayStack.searchStack(num));
    System.out.print("Frequency of: ");
    int num2=sc.nextInt();
    System.out.println("is"+arrayStack.elementFreq(num2));
*/
    //ArrayList Stack
    System.out.println("\nArrayList Stack");
    ArrayListStack arrayListStack=new ArrayListStack();
    arrayListStack.push(3);
    arrayListStack.push(4);
    arrayListStack.push(5);
    arrayListStack.push(6);
    arrayListStack.push(7);
    arrayListStack.push(8);
    arrayListStack.printStack();
    arrayListStack.pop();
    arrayListStack.pop();
    arrayListStack.pop();
    System.out.println("\nValue at top of stack after popping 3 elements: " + arrayListStack.peek());
    arrayListStack.pop();
    arrayListStack.pop();
    arrayListStack.pop();
    System.out.println("After popping all elements");
    arrayListStack.pop();
    arrayListStack.printStack();
    System.out.println("Value at top of stack after popping all elements: " + arrayListStack.peek());
    System.out.println("\nAfter pushing more elements");
    arrayListStack.push(9);
    arrayListStack.push(7);
    arrayListStack.push(9);
    System.out.println("Search stack for: ");
    Scanner sc =new Scanner(System.in);
    int num3=sc.nextInt();
    System.out.println(arrayListStack.searchStack(num3));
    System.out.println("Find frequency of element: ");
    int num4=sc.nextInt();
    System.out.println("Frequency: "+arrayListStack.elementFreq(num4));
    sc.close();

    }
}