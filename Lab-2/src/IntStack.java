import java.util.ArrayList;

public class IntStack {
        ArrayList<Integer> arrList= new ArrayList<>();
        private int top=-1;

        IntStack(){
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

}
