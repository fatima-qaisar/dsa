import java.util.ArrayList;

public class ArrayListStack {
    private int top=-1;
    private ArrayList<Integer> arrList= new ArrayList<>(4);

    public void push (int val){
            arrList.add(val);
            top++;
    }

    public int pop(){
        if (top == -1) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int v= arrList.get(top);
        --top;
        return v;
    }
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(arrList.get(i));
        }
    }

    public int peek(){
        return arrList.get(top);
    }

    public String searchStack(int val) {
        for (int i = 0; i <= top; i++) {
            if (arrList.get(i) == val) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = 0; i <= top; i++) {
            if (arrList.get(i) == val) {
                count++;
            }
        }
        return count;
    }

}
