import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> arrList= new ArrayList<>();
    private int top=-1;

    ArrayListStack(){
    }

    public void push (int val){
        arrList.add(val);
        ++top;
    }

    public int pop(){
        if (top==-1){ return -1;}
        int valAtTop=arrList.get(top);
        arrList.remove(top);
        top--;
        return valAtTop;
    }

    public void printStack(){
        if(top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for(int i=top; i>=0; i--){
                System.out.print(arrList.get(i));
       }
    }

    public int peek(){
        if(top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arrList.get(top);
    }

    public String searchStack(int val) {
        for (int i = top; i >= 0; i--) {
            if (val == arrList.get(i)) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = top; i >=0; i--) {
            if (arrList.get(i) == val) {
                count++;
            }
        }
        return count;
    }



    /*

    // Without using top

    public void push (int val){
            arrList.add(val);
    }

    public int pop(){
        if (arrList.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arrList.remove(arrList.size() - 1);
    }
    public void printStack(){
        if (arrList.isEmpty()) {
            System.out.println("Stack is empty.");
        }else{
        for(int i=arrList.size()-1; i>=0; i--){
            System.out.print(arrList.get(i));
        }
        }
    }

    public int peek(){
        if (arrList.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
        return arrList.get(arrList.size()-1);
    }}

    public String searchStack(int val) {
        for (int i = arrList.size()-1; i >= 0; i--) {
            if (val == arrList.get(i)) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = arrList.size()-1; i >=0; i--) {
            if (arrList.get(i) == val) {
                count++;
            }
        }
        return count;
    }
     */

}
