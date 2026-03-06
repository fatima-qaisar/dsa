import java.util.ArrayList;

public class CharStack {
    ArrayList<Character> arrList = new ArrayList<>();
    private int top = -1;

    CharStack() {
    }

    public void push(char val) {
        arrList.add(val);
        ++top;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        char valAtTop = arrList.get(top);
        arrList.remove(top);
        top--;
        return valAtTop;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arrList.get(i));
        }
    }

    public char peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return arrList.get(top);
    }

    public  boolean isEmpty(){
        if (top==-1){return true;}
        return false;
    }
}



