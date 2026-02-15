import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> arrList= new ArrayList<>();

    ArrayListStack(){
    }

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
        for(int i=0; i<= arrList.size()-1; i++){
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
        for (int i = 0; i <= arrList.size()-1; i++) {
            if (val == arrList.get(i)) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = 0; i <= arrList.size()-1; i++) {
            if (arrList.get(i) == val) {
                count++;
            }
        }
        return count;
    }

}
